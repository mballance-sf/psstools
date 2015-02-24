package net.sf.psstools.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.PSSPackage;
import net.sf.psstools.lang.pSS.action_declaration;
import net.sf.psstools.lang.pSS.action_port;
import net.sf.psstools.lang.pSS.action_portlist;
import net.sf.psstools.lang.pSS.alt_stmt;
import net.sf.psstools.lang.pSS.bin_scheme_declaration;
import net.sf.psstools.lang.pSS.bin_scheme_specifier;
import net.sf.psstools.lang.pSS.bin_specification;
import net.sf.psstools.lang.pSS.binary_add_sub_expr;
import net.sf.psstools.lang.pSS.binary_and_expr;
import net.sf.psstools.lang.pSS.binary_exp_expr;
import net.sf.psstools.lang.pSS.binary_mul_div_mod_expr;
import net.sf.psstools.lang.pSS.binary_shift_expr;
import net.sf.psstools.lang.pSS.binary_xor_expr;
import net.sf.psstools.lang.pSS.bins_declaration;
import net.sf.psstools.lang.pSS.condition_expr;
import net.sf.psstools.lang.pSS.constraint_declaration;
import net.sf.psstools.lang.pSS.constraint_set;
import net.sf.psstools.lang.pSS.data_declaration;
import net.sf.psstools.lang.pSS.data_instantiation;
import net.sf.psstools.lang.pSS.decimal_number;
import net.sf.psstools.lang.pSS.enum_type;
import net.sf.psstools.lang.pSS.explicit_bin_range;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.foreach_constraint_item;
import net.sf.psstools.lang.pSS.graph_data_declaration;
import net.sf.psstools.lang.pSS.graph_declaration;
import net.sf.psstools.lang.pSS.graph_interface_portmap;
import net.sf.psstools.lang.pSS.graph_interface_portmap_list;
import net.sf.psstools.lang.pSS.hierarchical_id;
import net.sf.psstools.lang.pSS.if_constraint_item;
import net.sf.psstools.lang.pSS.instance_override;
import net.sf.psstools.lang.pSS.integer_type;
import net.sf.psstools.lang.pSS.interface_action_definition;
import net.sf.psstools.lang.pSS.interface_action_id;
import net.sf.psstools.lang.pSS.interface_declaration;
import net.sf.psstools.lang.pSS.literal;
import net.sf.psstools.lang.pSS.logical_and_expr;
import net.sf.psstools.lang.pSS.logical_equality_expr;
import net.sf.psstools.lang.pSS.logical_inequality_expr;
import net.sf.psstools.lang.pSS.logical_or_expr;
import net.sf.psstools.lang.pSS.open_range_list;
import net.sf.psstools.lang.pSS.open_range_value;
import net.sf.psstools.lang.pSS.overides_declaration;
import net.sf.psstools.lang.pSS.parameter_list;
import net.sf.psstools.lang.pSS.port_declaration;
import net.sf.psstools.lang.pSS.port_map;
import net.sf.psstools.lang.pSS.range_expr;
import net.sf.psstools.lang.pSS.rule_repeat_stmt;
import net.sf.psstools.lang.pSS.rule_seq_item;
import net.sf.psstools.lang.pSS.rule_sequence;
import net.sf.psstools.lang.pSS.rule_stmt_parallel;
import net.sf.psstools.lang.pSS.rule_stmt_primary;
import net.sf.psstools.lang.pSS.rule_with_clause;
import net.sf.psstools.lang.pSS.size;
import net.sf.psstools.lang.pSS.stmt_alt;
import net.sf.psstools.lang.pSS.struct_declaration;
import net.sf.psstools.lang.pSS.symbol_decl_item;
import net.sf.psstools.lang.pSS.symbol_declaration;
import net.sf.psstools.lang.pSS.symbol_definition;
import net.sf.psstools.lang.pSS.type_inside_clause;
import net.sf.psstools.lang.pSS.type_override;
import net.sf.psstools.lang.pSS.typedef_declaration;
import net.sf.psstools.lang.pSS.user_defined_type;
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
			case PSSPackage.ACTION_PORT:
				if(context == grammarAccess.getAction_portRule()) {
					sequence_action_port(context, (action_port) semanticObject); 
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
				if(context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_or_blockRule()) {
					sequence_rule_stmt_alt_parallel_seq(context, (alt_stmt) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BIN_SCHEME_DECLARATION:
				if(context == grammarAccess.getBin_or_scheme_declarationRule() ||
				   context == grammarAccess.getBin_scheme_declarationRule() ||
				   context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getStruct_body_itemRule()) {
					sequence_bin_scheme_declaration(context, (bin_scheme_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BIN_SCHEME_SPECIFIER:
				if(context == grammarAccess.getBin_scheme_specifierRule()) {
					sequence_bin_scheme_specifier(context, (bin_scheme_specifier) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BIN_SPECIFICATION:
				if(context == grammarAccess.getBin_specificationRule()) {
					sequence_bin_specification(context, (bin_specification) semanticObject); 
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
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_and_expr(context, (binary_and_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_and_exprRule() ||
				   context == grammarAccess.getLogical_and_exprAccess().getLogical_and_exprLeftAction_1_0() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_xor_expr(context, (binary_xor_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_binary_xor_expr_expression_or_dist_item(context, (binary_xor_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.BINS_DECLARATION:
				if(context == grammarAccess.getBin_or_scheme_declarationRule() ||
				   context == grammarAccess.getBins_declarationRule() ||
				   context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule() ||
				   context == grammarAccess.getStruct_body_itemRule()) {
					sequence_bins_declaration(context, (bins_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.CONDITION_EXPR:
				if(context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getConstant_expressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_condition_expr(context, (condition_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_condition_expr_expression_or_dist_item(context, (condition_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.CONSTRAINT_DECLARATION:
				if(context == grammarAccess.getConstraint_declarationRule() ||
				   context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getStruct_body_itemRule()) {
					sequence_constraint_declaration(context, (constraint_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.CONSTRAINT_SET:
				if(context == grammarAccess.getConstraint_blockRule()) {
					sequence_constraint_block(context, (constraint_set) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraint_setRule()) {
					sequence_constraint_set(context, (constraint_set) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.DATA_DECLARATION:
				if(context == grammarAccess.getData_declarationRule() ||
				   context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule() ||
				   context == grammarAccess.getStruct_body_itemRule()) {
					sequence_data_declaration(context, (data_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.DATA_INSTANTIATION:
				if(context == grammarAccess.getData_instantiationRule()) {
					sequence_data_instantiation(context, (data_instantiation) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.DECIMAL_NUMBER:
				if(context == grammarAccess.getDecimal_numberRule()) {
					sequence_decimal_number(context, (decimal_number) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.ENUM_TYPE:
				if(context == grammarAccess.getData_typeRule() ||
				   context == grammarAccess.getEnum_typeRule()) {
					sequence_enum_type(context, (enum_type) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.EXPLICIT_BIN_RANGE:
				if(context == grammarAccess.getBin_range_divideRule()) {
					sequence_bin_range_divide_explicit_bin_range(context, (explicit_bin_range) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBin_range_sizeRule()) {
					sequence_bin_range_size_explicit_bin_range(context, (explicit_bin_range) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBin_specifierRule() ||
				   context == grammarAccess.getExplicit_bin_rangeRule()) {
					sequence_explicit_bin_range(context, (explicit_bin_range) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.EXPRESSION:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getForeach_constraint_itemRule()) {
					sequence_foreach_constraint_item(context, (foreach_constraint_item) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.GRAPH_DATA_DECLARATION:
				if(context == grammarAccess.getGraph_data_declarationRule()) {
					sequence_graph_data_declaration(context, (graph_data_declaration) semanticObject); 
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
			case PSSPackage.GRAPH_INTERFACE_PORTMAP:
				if(context == grammarAccess.getGraph_interface_portmapRule()) {
					sequence_graph_interface_portmap(context, (graph_interface_portmap) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.GRAPH_INTERFACE_PORTMAP_LIST:
				if(context == grammarAccess.getGraph_interface_portmap_listRule()) {
					sequence_graph_interface_portmap_list(context, (graph_interface_portmap_list) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.HIERARCHICAL_ID:
				if(context == grammarAccess.getHierarchical_idRule()) {
					sequence_hierarchical_id(context, (hierarchical_id) semanticObject); 
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
			case PSSPackage.INSTANCE_OVERRIDE:
				if(context == grammarAccess.getInstance_overrideRule() ||
				   context == grammarAccess.getOverride_stmtRule()) {
					sequence_instance_override(context, (instance_override) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.INTEGER_TYPE:
				if(context == grammarAccess.getData_typeRule() ||
				   context == grammarAccess.getInteger_typeRule()) {
					sequence_integer_type(context, (integer_type) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.INTERFACE_ACTION_DEFINITION:
				if(context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getInterface_action_definitionRule()) {
					sequence_interface_action_definition(context, (interface_action_definition) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.INTERFACE_ACTION_ID:
				if(context == grammarAccess.getInterface_action_idRule()) {
					sequence_interface_action_id(context, (interface_action_id) semanticObject); 
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
				if(context == grammarAccess.getBin_specifierRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getExplicit_bin_valueRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_literal(context, (literal) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.LOGICAL_AND_EXPR:
				if(context == grammarAccess.getConstraint_body_itemRule() ||
				   context == grammarAccess.getExpression_or_dist_itemRule()) {
					sequence_expression_or_dist_item_logical_and_expr(context, (logical_and_expr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCondition_exprRule() ||
				   context == grammarAccess.getCondition_exprAccess().getCondition_exprLeftAction_1_0() ||
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
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
				   context == grammarAccess.getConstant_expressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogical_or_exprRule() ||
				   context == grammarAccess.getLogical_or_exprAccess().getLogical_or_exprLeftAction_1_0()) {
					sequence_binary_or_expr_logical_or_expr(context, (logical_or_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.OPEN_RANGE_LIST:
				if(context == grammarAccess.getOpen_range_listRule()) {
					sequence_open_range_list(context, (open_range_list) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.OPEN_RANGE_VALUE:
				if(context == grammarAccess.getOpen_range_valueRule()) {
					sequence_open_range_value(context, (open_range_value) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.OVERIDES_DECLARATION:
				if(context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getOverrides_declarationRule()) {
					sequence_overrides_declaration(context, (overides_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.PARAMETER_LIST:
				if(context == grammarAccess.getParameter_listRule()) {
					sequence_parameter_list(context, (parameter_list) semanticObject); 
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
			case PSSPackage.RANGE_EXPR:
				if(context == grammarAccess.getRange_exprRule()) {
					sequence_range_expr(context, (range_expr) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.RULE_REPEAT_STMT:
				if(context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getRule_repeat_stmtRule() ||
				   context == grammarAccess.getRule_stmt_or_blockRule()) {
					sequence_rule_repeat_stmt(context, (rule_repeat_stmt) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.RULE_SEQ_ITEM:
				if(context == grammarAccess.getRule_seq_itemRule()) {
					sequence_rule_seq_item(context, (rule_seq_item) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.RULE_SEQUENCE:
				if(context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getRule_sequenceRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_or_blockRule() ||
				   context == grammarAccess.getRule_stmt_parallelRule() ||
				   context == grammarAccess.getRule_stmt_parallel_altRule() ||
				   context == grammarAccess.getRule_stmt_parallel_altAccess().getStmt_altLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_parallelAccess().getRule_stmt_parallelLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_primaryRule()) {
					sequence_rule_sequence(context, (rule_sequence) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.RULE_STMT_PARALLEL:
				if(context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_or_blockRule() ||
				   context == grammarAccess.getRule_stmt_parallelRule() ||
				   context == grammarAccess.getRule_stmt_parallel_altRule() ||
				   context == grammarAccess.getRule_stmt_parallel_altAccess().getStmt_altLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_parallelAccess().getRule_stmt_parallelLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_primaryRule()) {
					sequence_rule_stmt_parallel(context, (rule_stmt_parallel) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.RULE_STMT_PRIMARY:
				if(context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_or_blockRule() ||
				   context == grammarAccess.getRule_stmt_primaryRule()) {
					sequence_rule_stmt_primary(context, (rule_stmt_primary) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.RULE_WITH_CLAUSE:
				if(context == grammarAccess.getRule_with_clauseRule()) {
					sequence_rule_with_clause(context, (rule_with_clause) semanticObject); 
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
				if(context == grammarAccess.getRule_productionRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqRule() ||
				   context == grammarAccess.getRule_stmt_alt_parallel_seqAccess().getAlt_stmtLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_or_blockRule() ||
				   context == grammarAccess.getRule_stmt_parallel_altRule() ||
				   context == grammarAccess.getRule_stmt_parallel_altAccess().getStmt_altLeftAction_1_0() ||
				   context == grammarAccess.getRule_stmt_primaryRule()) {
					sequence_rule_stmt_parallel_alt(context, (stmt_alt) semanticObject); 
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
			case PSSPackage.SYMBOL_DECL_ITEM:
				if(context == grammarAccess.getSymbol_decl_itemRule()) {
					sequence_symbol_decl_item(context, (symbol_decl_item) semanticObject); 
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
			case PSSPackage.TYPE_INSIDE_CLAUSE:
				if(context == grammarAccess.getType_inside_clauseRule()) {
					sequence_type_inside_clause(context, (type_inside_clause) semanticObject); 
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
				if(context == grammarAccess.getGraph_body_itemRule() ||
				   context == grammarAccess.getPortable_stimulus_descriptionRule() ||
				   context == grammarAccess.getStruct_body_itemRule() ||
				   context == grammarAccess.getTypedef_declarationRule()) {
					sequence_typedef_declaration(context, (typedef_declaration) semanticObject); 
					return; 
				}
				else break;
			case PSSPackage.USER_DEFINED_TYPE:
				if(context == grammarAccess.getData_typeRule() ||
				   context == grammarAccess.getUser_defined_typeRule()) {
					sequence_user_defined_type(context, (user_defined_type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     root+=portable_stimulus_description*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identifier ports=action_portlist)
	 */
	protected void sequence_action_declaration(EObject context, action_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ACTION_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ACTION_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ACTION_DECLARATION__PORTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ACTION_DECLARATION__PORTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAction_declarationAccess().getNameIdentifierParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAction_declarationAccess().getPortsAction_portlistParserRuleCall_3_0(), semanticObject.getPorts());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=data_type name=identifier)
	 */
	protected void sequence_action_port(EObject context, action_port semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ACTION_PORT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ACTION_PORT__TYPE));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ACTION_PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ACTION_PORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAction_portAccess().getTypeData_typeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAction_portAccess().getNameIdentifierParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((ports+=action_port ports+=action_port*)?)
	 */
	protected void sequence_action_portlist(EObject context, action_portlist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (low=constant high=constant div=constant)
	 */
	protected void sequence_bin_range_divide_explicit_bin_range(EObject context, explicit_bin_range semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (low=constant high=constant size=constant)
	 */
	protected void sequence_bin_range_size_explicit_bin_range(EObject context, explicit_bin_range semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identifier items+=bin_scheme_specifier items+=bin_scheme_specifier*)
	 */
	protected void sequence_bin_scheme_declaration(EObject context, bin_scheme_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identifier spec=bin_specifier?)
	 */
	protected void sequence_bin_scheme_specifier(EObject context, bin_scheme_specifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=bin_specifier items+=bin_specifier*)
	 */
	protected void sequence_bin_specification(EObject context, bin_specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_add_sub_expr_binary_add_sub_expr_1_0 op=add_sub_op right=binary_mul_div_mod_expr)
	 */
	protected void sequence_binary_add_sub_expr(EObject context, binary_add_sub_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_add_sub_expr_binary_add_sub_expr_1_0 op=add_sub_op right=binary_mul_div_mod_expr impl_constraint=constraint_set?)
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
	 *     (left=binary_mul_div_mod_expr_binary_mul_div_mod_expr_1_0 op=mul_div_mod_op right=binary_exp_expr)
	 */
	protected void sequence_binary_mul_div_mod_expr(EObject context, binary_mul_div_mod_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_mul_div_mod_expr_binary_mul_div_mod_expr_1_0 op=mul_div_mod_op right=binary_exp_expr impl_constraint=constraint_set?)
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
	 *     (left=binary_shift_expr_binary_shift_expr_1_0 op=shift_op right=binary_add_sub_expr)
	 */
	protected void sequence_binary_shift_expr(EObject context, binary_shift_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=binary_shift_expr_binary_shift_expr_1_0 op=shift_op right=binary_add_sub_expr impl_constraint=constraint_set?)
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
	 *     (item=variable_identifier name=identifier bins=bin_specification)
	 */
	protected void sequence_bins_declaration(EObject context, bins_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.BIN_OR_SCHEME_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.BIN_OR_SCHEME_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.BINS_DECLARATION__ITEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.BINS_DECLARATION__ITEM));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.BINS_DECLARATION__BINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.BINS_DECLARATION__BINS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBins_declarationAccess().getItemVariable_identifierParserRuleCall_1_0(), semanticObject.getItem());
		feeder.accept(grammarAccess.getBins_declarationAccess().getNameIdentifierParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBins_declarationAccess().getBinsBin_specificationParserRuleCall_3_0(), semanticObject.getBins());
		feeder.finish();
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
	 *     (items+=constraint_body_item*)
	 */
	protected void sequence_constraint_block(EObject context, constraint_set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identifier body+=constraint_body_item*)
	 */
	protected void sequence_constraint_declaration(EObject context, constraint_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=constraint_body_item | items+=constraint_block)
	 */
	protected void sequence_constraint_set(EObject context, constraint_set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=data_type instances+=data_instantiation instances+=data_instantiation*)
	 */
	protected void sequence_data_declaration(EObject context, data_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identifier portmap=graph_interface_portmap_list?)
	 */
	protected void sequence_data_instantiation(EObject context, data_instantiation semanticObject) {
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
	 *     (data_type=integer_type? items+=identifier items+=identifier*)
	 */
	protected void sequence_enum_type(EObject context, enum_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (low=constant high=constant)
	 */
	protected void sequence_explicit_bin_range(EObject context, explicit_bin_range semanticObject) {
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
	 *     (left=logical_equality_expr_logical_equality_expr_1_0 op=eq_neq_op right=logical_inequality_expr impl_constraint=constraint_set?)
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
	 *     (type=[data_type|ID] names+=identifier (portmaps+=port_map portmaps+=port_map*)? (names+=identifier (portmaps+=port_map portmaps+=port_map*)?)*)
	 */
	protected void sequence_graph_data_declaration(EObject context, graph_data_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=graph_identifier 
	 *         (ports+=port_declaration ports+=port_declaration*)? 
	 *         super=[graph_or_struct_declaration|graph_or_struct_identifier]? 
	 *         body+=graph_body_item*
	 *     )
	 */
	protected void sequence_graph_declaration(EObject context, graph_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (portname=identifier connected_name=hierarchical_id)
	 */
	protected void sequence_graph_interface_portmap(EObject context, graph_interface_portmap semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.GRAPH_INTERFACE_PORTMAP__PORTNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.GRAPH_INTERFACE_PORTMAP__PORTNAME));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.GRAPH_INTERFACE_PORTMAP__CONNECTED_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.GRAPH_INTERFACE_PORTMAP__CONNECTED_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGraph_interface_portmapAccess().getPortnameIdentifierParserRuleCall_1_0(), semanticObject.getPortname());
		feeder.accept(grammarAccess.getGraph_interface_portmapAccess().getConnected_nameHierarchical_idParserRuleCall_3_0(), semanticObject.getConnected_name());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((maps+=graph_interface_portmap maps+=graph_interface_portmap*)?)
	 */
	protected void sequence_graph_interface_portmap_list(EObject context, graph_interface_portmap_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=identifier
	 */
	protected void sequence_hierarchical_id(EObject context, hierarchical_id semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.HIERARCHICAL_ID__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.HIERARCHICAL_ID__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHierarchical_idAccess().getValueIdentifierParserRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (src=hierarchical_id dest=identifier)
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
		feeder.accept(grammarAccess.getInstance_overrideAccess().getDestIdentifierParserRuleCall_3_0(), semanticObject.getDest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (atom_type=integer_atom_type (lhs=expression rhs=expression)? inside=type_inside_clause?)
	 */
	protected void sequence_integer_type(EObject context, integer_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=interface_action_id parameters=action_portlist body_items+=graph_body_item*)
	 */
	protected void sequence_interface_action_definition(EObject context, interface_action_definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifc=identifier action=identifier)
	 */
	protected void sequence_interface_action_id(EObject context, interface_action_id semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.INTERFACE_ACTION_ID__IFC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.INTERFACE_ACTION_ID__IFC));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.INTERFACE_ACTION_ID__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.INTERFACE_ACTION_ID__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterface_action_idAccess().getIfcIdentifierParserRuleCall_0_0(), semanticObject.getIfc());
		feeder.accept(grammarAccess.getInterface_action_idAccess().getActionIdentifierParserRuleCall_2_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=identifier super=[interface_declaration|ID]? body+=interface_body_item*)
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
	 *     (left=logical_equality_expr_logical_equality_expr_1_0 op=eq_neq_op right=logical_inequality_expr)
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
	 *     (ranges+=open_range_value ranges+=open_range_value*)
	 */
	protected void sequence_open_range_list(EObject context, open_range_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=expression | range=range_expr)
	 */
	protected void sequence_open_range_value(EObject context, open_range_value semanticObject) {
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
	 *     (parameters+=hierarchical_id parameters+=hierarchical_id*)
	 */
	protected void sequence_parameter_list(EObject context, parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifc_type=[interface_declaration|interface_identifier] name=port_identifier)
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
		feeder.accept(grammarAccess.getPort_declarationAccess().getIfc_typeInterface_declarationInterface_identifierParserRuleCall_1_0_1(), semanticObject.getIfc_type());
		feeder.accept(grammarAccess.getPort_declarationAccess().getNamePort_identifierParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (port=identifier map=hierarchical_id)
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
		feeder.accept(grammarAccess.getPort_mapAccess().getPortIdentifierParserRuleCall_1_0(), semanticObject.getPort());
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
	 *     (lhs=expression rhs=expression)
	 */
	protected void sequence_range_expr(EObject context, range_expr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.RANGE_EXPR__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.RANGE_EXPR__LHS));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.RANGE_EXPR__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.RANGE_EXPR__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRange_exprAccess().getLhsExpressionParserRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getRange_exprAccess().getRhsExpressionParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=expression? stmt=rule_stmt_or_block)
	 */
	protected void sequence_rule_repeat_stmt(EObject context, rule_repeat_stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((action=interface_action_id action_params=parameter_list) | (item=identifier with_clause=rule_with_clause?))
	 */
	protected void sequence_rule_seq_item(EObject context, rule_seq_item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=rule_seq_item items+=rule_seq_item*)
	 */
	protected void sequence_rule_sequence(EObject context, rule_sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=rule_stmt_alt_parallel_seq_alt_stmt_1_0 right=rule_stmt_primary)
	 */
	protected void sequence_rule_stmt_alt_parallel_seq(EObject context, alt_stmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ALT_STMT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ALT_STMT__LEFT));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.ALT_STMT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.ALT_STMT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRule_stmt_alt_parallel_seqAccess().getAlt_stmtLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRule_stmt_alt_parallel_seqAccess().getRightRule_stmt_primaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=rule_stmt_parallel_alt_stmt_alt_1_0 right=rule_stmt_parallel)
	 */
	protected void sequence_rule_stmt_parallel_alt(EObject context, stmt_alt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=rule_stmt_parallel_rule_stmt_parallel_1_0 right=rule_sequence)
	 */
	protected void sequence_rule_stmt_parallel(EObject context, rule_stmt_parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stmt_list+=rule_stmt_or_block*)
	 */
	protected void sequence_rule_stmt_primary(EObject context, rule_stmt_primary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body+=constraint_body_item*)
	 */
	protected void sequence_rule_with_clause(EObject context, rule_with_clause semanticObject) {
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
	 *     (name=identifier super=[struct_declaration|struct_identifier]? body+=struct_body_item*)
	 */
	protected void sequence_struct_declaration(EObject context, struct_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=identifier parameters=action_portlist?)
	 */
	protected void sequence_symbol_decl_item(EObject context, symbol_decl_item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (decl_list+=symbol_decl_item (inline_rule=rule_stmt_or_block | decl_list+=symbol_decl_item*))
	 */
	protected void sequence_symbol_declaration(EObject context, symbol_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (symbol_name=identifier body_items+=rule_production)
	 */
	protected void sequence_symbol_definition(EObject context, symbol_definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     domain=open_range_list
	 */
	protected void sequence_type_inside_clause(EObject context, type_inside_clause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.TYPE_INSIDE_CLAUSE__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.TYPE_INSIDE_CLAUSE__DOMAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getType_inside_clauseAccess().getDomainOpen_range_listParserRuleCall_2_0(), semanticObject.getDomain());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (src=identifier dest=identifier)
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
		feeder.accept(grammarAccess.getType_overrideAccess().getSrcIdentifierParserRuleCall_1_0(), semanticObject.getSrc());
		feeder.accept(grammarAccess.getType_overrideAccess().getDestIdentifierParserRuleCall_3_0(), semanticObject.getDest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=data_type type_identifier=identifier)
	 */
	protected void sequence_typedef_declaration(EObject context, typedef_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__TYPE_IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.TYPEDEF_DECLARATION__TYPE_IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedef_declarationAccess().getTypeData_typeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypedef_declarationAccess().getType_identifierIdentifierParserRuleCall_2_0(), semanticObject.getType_identifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     typename=identifier
	 */
	protected void sequence_user_defined_type(EObject context, user_defined_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PSSPackage.Literals.USER_DEFINED_TYPE__TYPENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PSSPackage.Literals.USER_DEFINED_TYPE__TYPENAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUser_defined_typeAccess().getTypenameIdentifierParserRuleCall_0(), semanticObject.getTypename());
		feeder.finish();
	}
}
