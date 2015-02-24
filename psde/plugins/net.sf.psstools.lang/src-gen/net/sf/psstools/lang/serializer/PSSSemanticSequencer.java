package net.sf.psstools.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.sf.psstools.lang.pSS.Model;
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
import net.sf.psstools.lang.pSS.constraint_declaration;
import net.sf.psstools.lang.pSS.constraint_set;
import net.sf.psstools.lang.pSS.decimal_number;
import net.sf.psstools.lang.pSS.domain_spec;
import net.sf.psstools.lang.pSS.enum_declaration;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.foreach_constraint_item;
import net.sf.psstools.lang.pSS.graph_data_declaration;
import net.sf.psstools.lang.pSS.graph_datatype;
import net.sf.psstools.lang.pSS.graph_declaration;
import net.sf.psstools.lang.pSS.hierarchical_id;
import net.sf.psstools.lang.pSS.if_constraint_item;
import net.sf.psstools.lang.pSS.ifc_call_parameter_list;
import net.sf.psstools.lang.pSS.instance_override;
import net.sf.psstools.lang.pSS.integer_type;
import net.sf.psstools.lang.pSS.interface_declaration;
import net.sf.psstools.lang.pSS.literal;
import net.sf.psstools.lang.pSS.logical_and_expr;
import net.sf.psstools.lang.pSS.logical_equality_expr;
import net.sf.psstools.lang.pSS.logical_inequality_expr;
import net.sf.psstools.lang.pSS.logical_or_expr;
import net.sf.psstools.lang.pSS.overides_declaration;
import net.sf.psstools.lang.pSS.port_declaration;
import net.sf.psstools.lang.pSS.port_map;
import net.sf.psstools.lang.pSS.repeat_stmt;
import net.sf.psstools.lang.pSS.scalar_signed;
import net.sf.psstools.lang.pSS.seq;
import net.sf.psstools.lang.pSS.signed_scalar;
import net.sf.psstools.lang.pSS.size;
import net.sf.psstools.lang.pSS.stmt_alt;
import net.sf.psstools.lang.pSS.stmt_parallel;
import net.sf.psstools.lang.pSS.stmt_primary;
import net.sf.psstools.lang.pSS.struct_data_declaration;
import net.sf.psstools.lang.pSS.struct_datatype;
import net.sf.psstools.lang.pSS.struct_declaration;
import net.sf.psstools.lang.pSS.symbol_declaration;
import net.sf.psstools.lang.pSS.symbol_definition;
import net.sf.psstools.lang.pSS.type_override;
import net.sf.psstools.lang.pSS.typedef_declaration;
import net.sf.psstools.lang.services.PSSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PSSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PSSGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PSSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PSSPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.ACTION_DECLARATION:
				if(context == grammarAccess.getAction_declarationRule() ||
				   context == grammarAccess.getInterface_body_itemRule()) {
					sequence_action_declaration(context, (action_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.ACTION_PORTLIST:
				if(context == grammarAccess.getAction_portlistRule()) {
					sequence_action_portlist(context, (action_portlist) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.ALT_STMT:
				if(context == grammarAccess.getAlt_stmtRule() ||
				   context == grammarAccess.getAlt_stmtAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getStmt_or_blockRule()) {
					sequence_alt_stmt(context, (alt_stmt) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BINARY_ADD_SUB_EXPR:
				if(context == grammarAccess.getBinary_add_sub_exprRule() ||
				   context == grammarAccess.getBinary_add_sub_exprAccess().getBinary_add_sub_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_shift_exprRule() ||
				   context == grammarAccess.getBinary_shift_exprAccess().getBinary_shift_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_equality_exprRule() ||
				   context == grammarAccess.getLogical_equality_exprAccess().getLogical_equality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_inequality_exprRule() ||
				   context == grammarAccess.getLogical_inequality_exprAccess().getLogical_inequality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_add_sub_expr(context, (binary_add_sub_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_add_sub_expr_expression_or_dist_item(context, (binary_add_sub_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BINARY_AND_EXPR:
				if(context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_and_expr(context, (binary_and_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_and_expr_expression_or_dist_item(context, (binary_and_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BINARY_EXP_EXPR:
				if(context == grammarAccess.getBinary_add_sub_exprRule() ||
				   context == grammarAccess.getBinary_add_sub_exprAccess().getBinary_add_sub_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_exp_exprRule() ||
				   context == grammarAccess.getBinary_exp_exprAccess().getBinary_exp_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_mul_div_mod_exprRule() ||
				   context == grammarAccess.getBinary_mul_div_mod_exprAccess().getBinary_mul_div_mod_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_shift_exprRule() ||
				   context == grammarAccess.getBinary_shift_exprAccess().getBinary_shift_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_equality_exprRule() ||
				   context == grammarAccess.getLogical_equality_exprAccess().getLogical_equality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_inequality_exprRule() ||
				   context == grammarAccess.getLogical_inequality_exprAccess().getLogical_inequality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_exp_expr(context, (binary_exp_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_exp_expr_expression_or_dist_item(context, (binary_exp_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BINARY_MUL_DIV_MOD_EXPR:
				if(context == grammarAccess.getBinary_add_sub_exprRule() ||
				   context == grammarAccess.getBinary_add_sub_exprAccess().getBinary_add_sub_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_mul_div_mod_exprRule() ||
				   context == grammarAccess.getBinary_mul_div_mod_exprAccess().getBinary_mul_div_mod_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_shift_exprRule() ||
				   context == grammarAccess.getBinary_shift_exprAccess().getBinary_shift_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_equality_exprRule() ||
				   context == grammarAccess.getLogical_equality_exprAccess().getLogical_equality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_inequality_exprRule() ||
				   context == grammarAccess.getLogical_inequality_exprAccess().getLogical_inequality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_mul_div_mod_expr(context, (binary_mul_div_mod_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_mul_div_mod_expr_expression_or_dist_item(context, (binary_mul_div_mod_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BINARY_SHIFT_EXPR:
				if(context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_shift_exprRule() ||
				   context == grammarAccess.getBinary_shift_exprAccess().getBinary_shift_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_equality_exprRule() ||
				   context == grammarAccess.getLogical_equality_exprAccess().getLogical_equality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_inequality_exprRule() ||
				   context == grammarAccess.getLogical_inequality_exprAccess().getLogical_inequality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_shift_expr(context, (binary_shift_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_shift_expr_expression_or_dist_item(context, (binary_shift_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BINARY_XOR_EXPR:
				if(context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_xor_expr(context, (binary_xor_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_xor_expr_expression_or_dist_item(context, (binary_xor_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.CONDITION_EXPR:
				if(context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_condition_expr(context, (condition_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_condition_expr_expression_or_dist_item(context, (condition_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.CONSTRAINT_DECLARATION:
				if(context == grammarAccess.getConstraint_declarationRule() ||
				   context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getStruct_body_itemRule() ||
				   context == grammarAccess.getStruct_graph_body_itemRule()) {
					sequence_constraint_declaration(context, (constraint_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.CONSTRAINT_SET:
				if(context == grammarAccess.getConstraint_setRule()) {
					sequence_constraint_set(context, (constraint_set) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.DECIMAL_NUMBER:
				if(context == grammarAccess.getDecimal_numberRule()) {
					sequence_decimal_number(context, (decimal_number) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.DOMAIN_SPEC:
				if(context == grammarAccess.getDomain_specRule()) {
					sequence_domain_spec(context, (domain_spec) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.ENUM_DECLARATION:
				if(context == grammarAccess.getData_declarationRule() ||
				   context == grammarAccess.getEnum_declarationRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule()) {
					sequence_enum_declaration(context, (enum_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.EXPRESSION:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_expression_or_dist_item_primary(context, (expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBinary_add_sub_exprRule() ||
				   context == grammarAccess.getBinary_add_sub_exprAccess().getBinary_add_sub_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_exp_exprRule() ||
				   context == grammarAccess.getBinary_exp_exprAccess().getBinary_exp_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_mul_div_mod_exprRule() ||
				   context == grammarAccess.getBinary_mul_div_mod_exprAccess().getBinary_mul_div_mod_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_shift_exprRule() ||
				   context == grammarAccess.getBinary_shift_exprAccess().getBinary_shift_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_equality_exprRule() ||
				   context == grammarAccess.getLogical_equality_exprAccess().getLogical_equality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_inequality_exprRule() ||
				   context == grammarAccess.getLogical_inequality_exprAccess().getLogical_inequality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnary_exprRule()) {
					sequence_primary(context, (expression) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.FOREACH_CONSTRAINT_ITEM:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getForeach_constraint_itemRule()) {
					sequence_foreach_constraint_item(context, (foreach_constraint_item) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.GRAPH_DATA_DECLARATION:
				if(context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getGraph_data_declarationRule()) {
					sequence_graph_data_declaration(context, (graph_data_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.GRAPH_DATATYPE:
				if(context == grammarAccess.getGraph_datatypeRule()) {
					sequence_graph_datatype(context, (graph_datatype) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.GRAPH_DECLARATION:
				if(context == grammarAccess.getGraph_declarationRule() ||
				   context == grammarAccess.getGraph_or_struct_declarationRule() ||
				   context == grammarAccess.getGraph_struct_ifc_declarationRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule()) {
					sequence_graph_declaration(context, (graph_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.HIERARCHICAL_ID:
				if(context == grammarAccess.getHierarchical_idRule()) {
					sequence_hierarchical_id(context, (hierarchical_id) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSeq_itemRule()) {
					sequence_hierarchical_id_seq_item(context, (hierarchical_id) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.IF_CONSTRAINT_ITEM:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getIf_constraint_itemRule()) {
					sequence_if_constraint_item(context, (if_constraint_item) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.IFC_CALL_PARAMETER_LIST:
				if(context == grammarAccess.getIfc_call_parameter_listRule()) {
					sequence_ifc_call_parameter_list(context, (ifc_call_parameter_list) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.INSTANCE_OVERRIDE:
				if(context == grammarAccess.getInstance_overrideRule() ||
				   context == grammarAccess.getOverride_stmtRule()) {
					sequence_instance_override(context, (instance_override) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.INTEGER_TYPE:
				if(context == grammarAccess.getAction_portlistRule()) {
					sequence_action_portlist_integer_type(context, (integer_type) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGraph_datatypeRule() ||
				   context == grammarAccess.getInteger_typeRule() ||
				   context == grammarAccess.getPrimitive_datatypeRule() ||
				   context == grammarAccess.getStruct_datatypeRule()) {
					sequence_integer_type(context, (integer_type) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.INTERFACE_DECLARATION:
				if(context == grammarAccess.getGraph_struct_ifc_declarationRule() ||
				   context == grammarAccess.getInterface_declarationRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule()) {
					sequence_interface_declaration(context, (interface_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_literal(context, (literal) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.LOGICAL_AND_EXPR:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_expression_or_dist_item_logical_and_expr(context, (logical_and_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_logical_and_expr(context, (logical_and_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.LOGICAL_EQUALITY_EXPR:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_expression_or_dist_item_logical_equality_expr(context, (logical_equality_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_equality_exprRule() ||
				   context == grammarAccess.getLogical_equality_exprAccess().getLogical_equality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_logical_equality_expr(context, (logical_equality_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.LOGICAL_INEQUALITY_EXPR:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_expression_or_dist_item_logical_inequality_expr(context, (logical_inequality_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBinary_and_exprRule() ||
				   context == grammarAccess.getBinary_and_exprAccess().getBinary_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getBinary_xor_exprRule() ||
				   context == grammarAccess.getBinary_xor_exprAccess().getBinary_xor_exprLeftAction_1_0() ||
				   context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_equality_exprRule() ||
				   context == grammarAccess.getLogical_equality_exprAccess().getLogical_equality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_inequality_exprRule() ||
				   context == grammarAccess.getLogical_inequality_exprAccess().getLogical_inequality_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_logical_inequality_expr(context, (logical_inequality_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.LOGICAL_OR_EXPR:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getConstraint_body_no_if_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_or_expr_expression_or_dist_item_logical_or_expr(context, (logical_or_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBinary_or_exprRule() ||
				   context == grammarAccess.getBinary_or_exprAccess().getLogical_or_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0()) {
					sequence_binary_or_expr(context, (logical_or_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_or_expr_logical_or_expr(context, (logical_or_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.OVERIDES_DECLARATION:
				if(context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getOverrides_declarationRule() ||
				   context == grammarAccess.getStruct_body_itemRule() ||
				   context == grammarAccess.getStruct_graph_body_itemRule()) {
					sequence_overrides_declaration(context, (overides_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.PORT_DECLARATION:
				if(context == grammarAccess.getPort_declarationRule()) {
					sequence_port_declaration(context, (port_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.PORT_MAP:
				if(context == grammarAccess.getPort_mapRule()) {
					sequence_port_map(context, (port_map) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.REPEAT_STMT:
				if(context == grammarAccess.getRepeat_stmtRule() ||
				   context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getStmt_or_blockRule()) {
					sequence_repeat_stmt(context, (repeat_stmt) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.SCALAR_SIGNED:
				if(context == grammarAccess.getScalar_signedRule()) {
					sequence_scalar_signed(context, (scalar_signed) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.SEQ:
				if(context == grammarAccess.getAlt_stmtRule() ||
				   context == grammarAccess.getAlt_stmtAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getSeqRule() ||
				   context == grammarAccess.getStmt_altRule() ||
				   context == grammarAccess.getStmt_altAccess().getStmt_altLeftAction_1_0() ||
				   context == grammarAccess.getStmt_or_blockRule() ||
				   context == grammarAccess.getStmt_parallelRule() ||
				   context == grammarAccess.getStmt_parallelAccess().getStmt_parallelLeftAction_1_0() ||
				   context == grammarAccess.getStmt_primaryRule()) {
					sequence_seq(context, (seq) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.SIGNED_SCALAR:
				if(context == grammarAccess.getData_declarationRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule() ||
				   context == grammarAccess.getScalar_declarationRule()) {
					sequence_scalar_declaration_signed_scalar(context, (signed_scalar) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSigned_scalarRule()) {
					sequence_signed_scalar(context, (signed_scalar) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.SIZE:
				if(context == grammarAccess.getDecimal_numberRule() ||
				   context == grammarAccess.getSizeRule()) {
					sequence_size(context, (size) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.STMT_ALT:
				if(context == grammarAccess.getAlt_stmtRule() ||
				   context == grammarAccess.getAlt_stmtAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getStmt_altRule() ||
				   context == grammarAccess.getStmt_altAccess().getStmt_altLeftAction_1_0() ||
				   context == grammarAccess.getStmt_or_blockRule() ||
				   context == grammarAccess.getStmt_primaryRule()) {
					sequence_stmt_alt(context, (stmt_alt) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.STMT_PARALLEL:
				if(context == grammarAccess.getAlt_stmtRule() ||
				   context == grammarAccess.getAlt_stmtAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getStmt_altRule() ||
				   context == grammarAccess.getStmt_altAccess().getStmt_altLeftAction_1_0() ||
				   context == grammarAccess.getStmt_or_blockRule() ||
				   context == grammarAccess.getStmt_parallelRule() ||
				   context == grammarAccess.getStmt_parallelAccess().getStmt_parallelLeftAction_1_0() ||
				   context == grammarAccess.getStmt_primaryRule()) {
					sequence_stmt_parallel(context, (stmt_parallel) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.STMT_PRIMARY:
				if(context == grammarAccess.getAlt_stmtRule() ||
				   context == grammarAccess.getAlt_stmtAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getStmt_or_blockRule() ||
				   context == grammarAccess.getStmt_primaryRule()) {
					sequence_stmt_primary(context, (stmt_primary) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.STRUCT_DATA_DECLARATION:
				if(context == grammarAccess.getStruct_body_itemRule() ||
				   context == grammarAccess.getStruct_data_declarationRule()) {
					sequence_struct_data_declaration(context, (struct_data_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.STRUCT_DATATYPE:
				if(context == grammarAccess.getStruct_datatypeRule()) {
					sequence_struct_datatype(context, (struct_datatype) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.STRUCT_DECLARATION:
				if(context == grammarAccess.getGraph_or_struct_declarationRule() ||
				   context == grammarAccess.getGraph_struct_ifc_declarationRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule() ||
				   context == grammarAccess.getStruct_declarationRule()) {
					sequence_struct_declaration(context, (struct_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.SYMBOL_DECLARATION:
				if(context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getSymbol_declarationRule()) {
					sequence_symbol_declaration(context, (symbol_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.SYMBOL_DEFINITION:
				if(context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getSymbol_definitionRule()) {
					sequence_symbol_definition(context, (symbol_definition) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.TYPE_OVERRIDE:
				if(context == grammarAccess.getOverride_stmtRule() ||
				   context == grammarAccess.getType_overrideRule()) {
					sequence_type_override(context, (type_override) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.TYPEDEF_DECLARATION:
				if(context == grammarAccess.getData_declarationRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule() ||
				   context == grammarAccess.getTypedef_declarationRule()) {
					sequence_typedef_declaration(context, (typedef_declaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     topLevel+=portable_stimulus_description*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (ports+=action_portlist ports+=action_portlist*)?)
	 */
	protected void sequence_action_declaration(EObject context, action_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[struct_declaration|ID] name=ID)
	 */
	protected void sequence_action_portlist(EObject context, action_portlist semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ACTION_PORTLIST__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ACTION_PORTLIST__TYPE));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ACTION_PORTLIST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ACTION_PORTLIST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAction_portlistAccess().getTypeStruct_declarationIDTerminalRuleCall_1_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getAction_portlistAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((range_lhs=INT range_rhs=INT)? name=ID)
	 */
	protected void sequence_action_portlist_integer_type(EObject context, integer_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=alt_stmt_alt_stmt_1_0 right=stmt_primary)
	 */
	protected void sequence_alt_stmt(EObject context, alt_stmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ALT_STMT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ALT_STMT__LEFT));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ALT_STMT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ALT_STMT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlt_stmtAccess().getAlt_stmtLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAlt_stmtAccess().getRightStmt_primaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_add_sub_expr_binary_add_sub_expr_1_0 (op='+' | op='-') right=binary_mul_div_mod_expr)
	 */
	protected void sequence_binary_add_sub_expr(EObject context, binary_add_sub_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_add_sub_expr_binary_add_sub_expr_1_0 (op='+' | op='-') right=binary_mul_div_mod_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_binary_add_sub_expr_expression_or_dist_item(EObject context, binary_add_sub_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_and_expr_binary_and_expr_1_0 right=logical_equality_expr)
	 */
	protected void sequence_binary_and_expr(EObject context, binary_and_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_and_expr_binary_and_expr_1_0 right=logical_equality_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_binary_and_expr_expression_or_dist_item(EObject context, binary_and_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_exp_expr_binary_exp_expr_1_0 right=unary_expr)
	 */
	protected void sequence_binary_exp_expr(EObject context, binary_exp_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_exp_expr_binary_exp_expr_1_0 right=unary_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_binary_exp_expr_expression_or_dist_item(EObject context, binary_exp_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_mul_div_mod_expr_binary_mul_div_mod_expr_1_0 (op='*' | op='/' | op='%') right=binary_exp_expr)
	 */
	protected void sequence_binary_mul_div_mod_expr(EObject context, binary_mul_div_mod_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_mul_div_mod_expr_binary_mul_div_mod_expr_1_0 (op='*' | op='/' | op='%') right=binary_exp_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_binary_mul_div_mod_expr_expression_or_dist_item(EObject context, binary_mul_div_mod_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((left=logical_or_expr_logical_or_expr_1_0 right=logical_and_expr) | (left=binary_or_expr_logical_or_expr_1_0 right=binary_xor_expr)) 
	 *         impl_constraint=constraint_set?
	 *     )
	 */
	protected void sequence_binary_or_expr_expression_or_dist_item_logical_or_expr(EObject context, logical_or_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_or_expr_logical_or_expr_1_0 right=binary_xor_expr)
	 */
	protected void sequence_binary_or_expr(EObject context, logical_or_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=logical_or_expr_logical_or_expr_1_0 right=logical_and_expr) | (left=binary_or_expr_logical_or_expr_1_0 right=binary_xor_expr))
	 */
	protected void sequence_binary_or_expr_logical_or_expr(EObject context, logical_or_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_shift_expr_binary_shift_expr_1_0 (op='<<' | op='>>') right=binary_add_sub_expr)
	 */
	protected void sequence_binary_shift_expr(EObject context, binary_shift_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_shift_expr_binary_shift_expr_1_0 (op='<<' | op='>>') right=binary_add_sub_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_binary_shift_expr_expression_or_dist_item(EObject context, binary_shift_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_xor_expr_binary_xor_expr_1_0 right=binary_and_expr)
	 */
	protected void sequence_binary_xor_expr(EObject context, binary_xor_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_xor_expr_binary_xor_expr_1_0 right=binary_and_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_binary_xor_expr_expression_or_dist_item(EObject context, binary_xor_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=condition_expr_condition_expr_1_0 true_expr=logical_or_expr false_expr=logical_or_expr)
	 */
	protected void sequence_condition_expr(EObject context, condition_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=condition_expr_condition_expr_1_0 true_expr=logical_or_expr false_expr=logical_or_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_condition_expr_expression_or_dist_item(EObject context, condition_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID body+=constraint_body_item*)
	 */
	protected void sequence_constraint_declaration(EObject context, constraint_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=constraint_body_item*)
	 */
	protected void sequence_constraint_set(EObject context, constraint_set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT?
	 */
	protected void sequence_decimal_number(EObject context, decimal_number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((range_lhs=INT range_rhs=INT) | range_lhs=INT)
	 */
	protected void sequence_domain_spec(EObject context, domain_spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (data_type=integer_type? items+=ID items+=ID* name=ID)
	 */
	protected void sequence_enum_declaration(EObject context, enum_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=logical_and_expr_logical_and_expr_1_0 right=binary_or_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_expression_or_dist_item_logical_and_expr(EObject context, logical_and_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=logical_equality_expr_logical_equality_expr_1_0 (op='==' | op='!=') right=logical_inequality_expr impl_constraint=constraint_set?)
	 */
	protected void sequence_expression_or_dist_item_logical_equality_expr(EObject context, logical_equality_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=logical_inequality_expr_logical_inequality_expr_1_0 
	 *         (op='<' | op='<=' | op='>' | op='>=' | op='inside') 
	 *         right=binary_shift_expr 
	 *         impl_constraint=constraint_set?
	 *     )
	 */
	protected void sequence_expression_or_dist_item_logical_inequality_expr(EObject context, logical_inequality_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expr=literal | expr=expression | (expr=hierarchical_id (lhs=expression rhs=expression?)?)) impl_constraint=constraint_set?)
	 */
	protected void sequence_expression_or_dist_item_primary(EObject context, expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=expression body=constraint_set)
	 */
	protected void sequence_foreach_constraint_item(EObject context, foreach_constraint_item semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.FOREACH_CONSTRAINT_ITEM__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.FOREACH_CONSTRAINT_ITEM__EXPR));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.FOREACH_CONSTRAINT_ITEM__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.FOREACH_CONSTRAINT_ITEM__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForeach_constraint_itemAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getForeach_constraint_itemAccess().getBodyConstraint_setParserRuleCall_4_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=graph_datatype names+=ID (portmaps+=port_map portmaps+=port_map*)? (names+=ID (portmaps+=port_map portmaps+=port_map*)?)*)
	 */
	protected void sequence_graph_data_declaration(EObject context, graph_data_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     graph_typename=[graph_struct_ifc_declaration|ID]
	 */
	protected void sequence_graph_datatype(EObject context, graph_datatype semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.GRAPH_DATATYPE__GRAPH_TYPENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.GRAPH_DATATYPE__GRAPH_TYPENAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGraph_datatypeAccess().getGraph_typenameGraph_struct_ifc_declarationIDTerminalRuleCall_1_0_1(), semanticObject.getGraph_typename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (ports+=port_declaration ports+=port_declaration*)? super=[graph_or_struct_declaration|ID]? body+=graph_body_item*)
	 */
	protected void sequence_graph_declaration(EObject context, graph_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_hierarchical_id(EObject context, hierarchical_id semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=ID parameters=ifc_call_parameter_list?)
	 */
	protected void sequence_hierarchical_id_seq_item(EObject context, hierarchical_id semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if_expr=expression true_case=constraint_set false_set=constraint_set?)
	 */
	protected void sequence_if_constraint_item(EObject context, if_constraint_item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=hierarchical_id parameters+=hierarchical_id*)
	 */
	protected void sequence_ifc_call_parameter_list(EObject context, ifc_call_parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=hierarchical_id dest=ID)
	 */
	protected void sequence_instance_override(EObject context, instance_override semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.OVERRIDE_STMT__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.OVERRIDE_STMT__DEST));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.INSTANCE_OVERRIDE__SRC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.INSTANCE_OVERRIDE__SRC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstance_overrideAccess().getSrcHierarchical_idParserRuleCall_1_0(), semanticObject.getSrc());
		feeder.accept(grammarAccess.getInstance_overrideAccess().getDestIDTerminalRuleCall_3_0(), semanticObject.getDest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((range_lhs=INT range_rhs=INT)?)
	 */
	protected void sequence_integer_type(EObject context, integer_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID super=[interface_declaration|ID]? body+=interface_body_item*)
	 */
	protected void sequence_interface_declaration(EObject context, interface_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_literal(EObject context, literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=logical_and_expr_logical_and_expr_1_0 right=binary_or_expr)
	 */
	protected void sequence_logical_and_expr(EObject context, logical_and_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=logical_equality_expr_logical_equality_expr_1_0 (op='==' | op='!=') right=logical_inequality_expr)
	 */
	protected void sequence_logical_equality_expr(EObject context, logical_equality_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=logical_inequality_expr_logical_inequality_expr_1_0 (op='<' | op='<=' | op='>' | op='>=' | op='inside') right=binary_shift_expr)
	 */
	protected void sequence_logical_inequality_expr(EObject context, logical_inequality_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (overrides+=override_stmt*)
	 */
	protected void sequence_overrides_declaration(EObject context, overides_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifc_type=[interface_declaration|ID] name=ID)
	 */
	protected void sequence_port_declaration(EObject context, port_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.PORT_DECLARATION__IFC_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.PORT_DECLARATION__IFC_TYPE));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.PORT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.PORT_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPort_declarationAccess().getIfc_typeInterface_declarationIDTerminalRuleCall_1_0_1(), semanticObject.getIfc_type());
		feeder.accept(grammarAccess.getPort_declarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (port=ID map=hierarchical_id)
	 */
	protected void sequence_port_map(EObject context, port_map semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.PORT_MAP__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.PORT_MAP__PORT));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.PORT_MAP__MAP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.PORT_MAP__MAP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPort_mapAccess().getPortIDTerminalRuleCall_1_0(), semanticObject.getPort());
		feeder.accept(grammarAccess.getPort_mapAccess().getMapHierarchical_idParserRuleCall_3_0(), semanticObject.getMap());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=literal | expr=expression | (expr=hierarchical_id (lhs=expression rhs=expression?)?))
	 */
	protected void sequence_primary(EObject context, expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stmt=stmt_or_block
	 */
	protected void sequence_repeat_stmt(EObject context, repeat_stmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.REPEAT_STMT__STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.REPEAT_STMT__STMT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRepeat_stmtAccess().getStmtStmt_or_blockParserRuleCall_1_0(), semanticObject.getStmt());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (lhs=expression rhs=expression)? (items+=domain_spec items+=domain_spec*)?)
	 */
	protected void sequence_scalar_declaration_signed_scalar(EObject context, signed_scalar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_scalar_signed(EObject context, scalar_signed semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.SCALAR_SIGNED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.SCALAR_SIGNED__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalar_signedAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (items+=seq_item items+=seq_item*)
	 */
	protected void sequence_seq(EObject context, seq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_signed_scalar(EObject context, signed_scalar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_size(EObject context, size semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.DECIMAL_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.DECIMAL_NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=stmt_alt_stmt_alt_1_0 right=stmt_parallel)
	 */
	protected void sequence_stmt_alt(EObject context, stmt_alt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=stmt_parallel_stmt_parallel_1_0 right=seq)
	 */
	protected void sequence_stmt_parallel(EObject context, stmt_parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stmt_list+=stmt_or_block*)
	 */
	protected void sequence_stmt_primary(EObject context, stmt_primary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=struct_datatype names+=ID names+=ID*)
	 */
	protected void sequence_struct_data_declaration(EObject context, struct_data_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     struct_typename=[struct_declaration|ID]
	 */
	protected void sequence_struct_datatype(EObject context, struct_datatype semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.STRUCT_DATATYPE__STRUCT_TYPENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.STRUCT_DATATYPE__STRUCT_TYPENAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStruct_datatypeAccess().getStruct_typenameStruct_declarationIDTerminalRuleCall_1_0_1(), semanticObject.getStruct_typename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID super=[struct_declaration|ID]? body+=struct_body_item*)
	 */
	protected void sequence_struct_declaration(EObject context, struct_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID inline_rule=stmt_or_block?) | (names+=ID names+=ID inline_rule=stmt_or_block?))
	 */
	protected void sequence_symbol_declaration(EObject context, symbol_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rule=rule_production)
	 */
	protected void sequence_symbol_definition(EObject context, symbol_definition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.SYMBOL_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.SYMBOL_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.SYMBOL_DEFINITION__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.SYMBOL_DEFINITION__RULE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSymbol_definitionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSymbol_definitionAccess().getRuleRule_productionParserRuleCall_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (src=ID dest=ID)
	 */
	protected void sequence_type_override(EObject context, type_override semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.OVERRIDE_STMT__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.OVERRIDE_STMT__DEST));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.TYPE_OVERRIDE__SRC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.TYPE_OVERRIDE__SRC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getType_overrideAccess().getSrcIDTerminalRuleCall_1_0(), semanticObject.getSrc());
		feeder.accept(grammarAccess.getType_overrideAccess().getDestIDTerminalRuleCall_3_0(), semanticObject.getDest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (src=ID dest=ID)
	 */
	protected void sequence_typedef_declaration(EObject context, typedef_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__SRC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__SRC));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__DEST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedef_declarationAccess().getSrcIDTerminalRuleCall_1_0(), semanticObject.getSrc());
		feeder.accept(grammarAccess.getTypedef_declarationAccess().getDestIDTerminalRuleCall_2_0(), semanticObject.getDest());
		feeder.finish();
	}
}
