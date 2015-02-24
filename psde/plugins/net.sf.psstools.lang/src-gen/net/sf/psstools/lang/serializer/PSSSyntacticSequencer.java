package net.sf.psstools.lang.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.sf.psstools.lang.services.PSSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PSSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PSSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_action_port_Io_directionParserRuleCall_0_q;
	protected AbstractElementAlias match_bin_specification_Bin_wildcardParserRuleCall_2_q;
	protected AbstractElementAlias match_constraint_declaration_DynamicKeyword_2_q;
	protected AbstractElementAlias match_graph_body_item_RandKeyword_2_0_q;
	protected AbstractElementAlias match_graph_data_declaration_RandKeyword_0_q;
	protected AbstractElementAlias match_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_hierarchical_id___FullStopKeyword_1_0_IdentifierParserRuleCall_1_1__a;
	protected AbstractElementAlias match_integer_type___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q;
	protected AbstractElementAlias match_port_declaration_ExportKeyword_0_q;
	protected AbstractElementAlias match_range_expr_ColonKeyword_2_0_or_FullStopFullStopKeyword_2_1;
	protected AbstractElementAlias match_struct_body_item_RandKeyword_1_0_q;
	protected AbstractElementAlias match_unary_expr_Unary_opParserRuleCall_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PSSGrammarAccess) access;
		match_action_port_Io_directionParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAction_portAccess().getIo_directionParserRuleCall_0());
		match_bin_specification_Bin_wildcardParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getBin_specificationAccess().getBin_wildcardParserRuleCall_2());
		match_constraint_declaration_DynamicKeyword_2_q = new TokenAlias(false, true, grammarAccess.getConstraint_declarationAccess().getDynamicKeyword_2());
		match_graph_body_item_RandKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getGraph_body_itemAccess().getRandKeyword_2_0());
		match_graph_data_declaration_RandKeyword_0_q = new TokenAlias(false, true, grammarAccess.getGraph_data_declarationAccess().getRandKeyword_0());
		match_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGraph_declarationAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getGraph_declarationAccess().getRightParenthesisKeyword_2_2()));
		match_hierarchical_id___FullStopKeyword_1_0_IdentifierParserRuleCall_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getHierarchical_idAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getHierarchical_idAccess().getIdentifierParserRuleCall_1_1()));
		match_integer_type___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getInteger_typeAccess().getSignedKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getInteger_typeAccess().getUnsignedKeyword_0_1()));
		match_port_declaration_ExportKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPort_declarationAccess().getExportKeyword_0());
		match_range_expr_ColonKeyword_2_0_or_FullStopFullStopKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRange_exprAccess().getColonKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRange_exprAccess().getFullStopFullStopKeyword_2_1()));
		match_struct_body_item_RandKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getStruct_body_itemAccess().getRandKeyword_1_0());
		match_unary_expr_Unary_opParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getUnary_exprAccess().getUnary_opParserRuleCall_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBin_identifierRule())
			return getbin_identifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBin_wildcardRule())
			return getbin_wildcardToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIdentifierRule())
			return getidentifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIo_directionRule())
			return getio_directionToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getUnary_opRule())
			return getunary_opToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * bin_identifier: identifier;
	 */
	protected String getbin_identifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\\";
	}
	
	/**
	 * bin_wildcard:
	 *  	'[*]'
	 *  ;
	 */
	protected String getbin_wildcardToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[*]";
	}
	
	/**
	 * identifier: ID;
	 */
	protected String getidentifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\\";
	}
	
	/**
	 * io_direction:
	 * 	'input' | 'output' | 'inout'
	 * ;
	 */
	protected String getio_directionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "input";
	}
	
	/**
	 * unary_op: '+' | '-' | '!' | '~' | '&' | '|' | '^';
	 */
	protected String getunary_opToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_action_port_Io_directionParserRuleCall_0_q.equals(syntax))
				emit_action_port_Io_directionParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bin_specification_Bin_wildcardParserRuleCall_2_q.equals(syntax))
				emit_bin_specification_Bin_wildcardParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_constraint_declaration_DynamicKeyword_2_q.equals(syntax))
				emit_constraint_declaration_DynamicKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_graph_body_item_RandKeyword_2_0_q.equals(syntax))
				emit_graph_body_item_RandKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_graph_data_declaration_RandKeyword_0_q.equals(syntax))
				emit_graph_data_declaration_RandKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_hierarchical_id___FullStopKeyword_1_0_IdentifierParserRuleCall_1_1__a.equals(syntax))
				emit_hierarchical_id___FullStopKeyword_1_0_IdentifierParserRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_integer_type___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q.equals(syntax))
				emit_integer_type___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_port_declaration_ExportKeyword_0_q.equals(syntax))
				emit_port_declaration_ExportKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_range_expr_ColonKeyword_2_0_or_FullStopFullStopKeyword_2_1.equals(syntax))
				emit_range_expr_ColonKeyword_2_0_or_FullStopFullStopKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_struct_body_item_RandKeyword_1_0_q.equals(syntax))
				emit_struct_body_item_RandKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_unary_expr_Unary_opParserRuleCall_0_q.equals(syntax))
				emit_unary_expr_Unary_opParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     io_direction?
	 */
	protected void emit_action_port_Io_directionParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     bin_wildcard?
	 */
	protected void emit_bin_specification_Bin_wildcardParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'dynamic'?
	 */
	protected void emit_constraint_declaration_DynamicKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rand'?
	 */
	protected void emit_graph_body_item_RandKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rand'?
	 */
	protected void emit_graph_data_declaration_RandKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' identifier)*
	 */
	protected void emit_hierarchical_id___FullStopKeyword_1_0_IdentifierParserRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('signed' | 'unsigned')?
	 */
	protected void emit_integer_type___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'export'?
	 */
	protected void emit_port_declaration_ExportKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':' | '..'
	 */
	protected void emit_range_expr_ColonKeyword_2_0_or_FullStopFullStopKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rand'?
	 */
	protected void emit_struct_body_item_RandKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     unary_op?
	 */
	protected void emit_unary_expr_Unary_opParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
