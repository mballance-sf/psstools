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
	protected AbstractElementAlias match_action_portlist_Io_directionParserRuleCall_0_q;
	protected AbstractElementAlias match_graph_data_declaration_RandKeyword_0_q;
	protected AbstractElementAlias match_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_hierarchical_id___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a;
	protected AbstractElementAlias match_integer_type_BitKeyword_1_1_or_IntKeyword_0_1;
	protected AbstractElementAlias match_port_declaration_ExportKeyword_0_q;
	protected AbstractElementAlias match_primitive_datatype_SignedKeyword_0_0_q_or_UnsignedKeyword_0_1_q;
	protected AbstractElementAlias match_primitive_datatype___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q;
	protected AbstractElementAlias match_struct_data_declaration_RandKeyword_0_q;
	protected AbstractElementAlias match_unary_expr___AmpersandKeyword_0_4_or_CircumflexAccentKeyword_0_6_or_ExclamationMarkKeyword_0_2_or_HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0_or_TildeKeyword_0_3_or_VerticalLineKeyword_0_5__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PSSGrammarAccess) access;
		match_action_portlist_Io_directionParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAction_portlistAccess().getIo_directionParserRuleCall_0());
		match_graph_data_declaration_RandKeyword_0_q = new TokenAlias(false, true, grammarAccess.getGraph_data_declarationAccess().getRandKeyword_0());
		match_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGraph_declarationAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getGraph_declarationAccess().getRightParenthesisKeyword_2_2()));
		match_hierarchical_id___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getHierarchical_idAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getHierarchical_idAccess().getIDTerminalRuleCall_1_1()));
		match_integer_type_BitKeyword_1_1_or_IntKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInteger_typeAccess().getBitKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getInteger_typeAccess().getIntKeyword_0_1()));
		match_port_declaration_ExportKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPort_declarationAccess().getExportKeyword_0());
		match_primitive_datatype_SignedKeyword_0_0_q_or_UnsignedKeyword_0_1_q = new AlternativeAlias(false, false, new TokenAlias(false, true, grammarAccess.getPrimitive_datatypeAccess().getSignedKeyword_0_0()), new TokenAlias(false, true, grammarAccess.getPrimitive_datatypeAccess().getUnsignedKeyword_0_1()));
		match_primitive_datatype___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getPrimitive_datatypeAccess().getSignedKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPrimitive_datatypeAccess().getUnsignedKeyword_0_1()));
		match_struct_data_declaration_RandKeyword_0_q = new TokenAlias(false, true, grammarAccess.getStruct_data_declarationAccess().getRandKeyword_0());
		match_unary_expr___AmpersandKeyword_0_4_or_CircumflexAccentKeyword_0_6_or_ExclamationMarkKeyword_0_2_or_HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0_or_TildeKeyword_0_3_or_VerticalLineKeyword_0_5__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getUnary_exprAccess().getAmpersandKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getUnary_exprAccess().getCircumflexAccentKeyword_0_6()), new TokenAlias(false, false, grammarAccess.getUnary_exprAccess().getExclamationMarkKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getUnary_exprAccess().getHyphenMinusKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getUnary_exprAccess().getPlusSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getUnary_exprAccess().getTildeKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getUnary_exprAccess().getVerticalLineKeyword_0_5()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIo_directionRule())
			return getio_directionToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_action_portlist_Io_directionParserRuleCall_0_q.equals(syntax))
				emit_action_portlist_Io_directionParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_graph_data_declaration_RandKeyword_0_q.equals(syntax))
				emit_graph_data_declaration_RandKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_graph_declaration___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_hierarchical_id___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a.equals(syntax))
				emit_hierarchical_id___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_integer_type_BitKeyword_1_1_or_IntKeyword_0_1.equals(syntax))
				emit_integer_type_BitKeyword_1_1_or_IntKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_port_declaration_ExportKeyword_0_q.equals(syntax))
				emit_port_declaration_ExportKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_primitive_datatype_SignedKeyword_0_0_q_or_UnsignedKeyword_0_1_q.equals(syntax))
				emit_primitive_datatype_SignedKeyword_0_0_q_or_UnsignedKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_primitive_datatype___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q.equals(syntax))
				emit_primitive_datatype___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_struct_data_declaration_RandKeyword_0_q.equals(syntax))
				emit_struct_data_declaration_RandKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_unary_expr___AmpersandKeyword_0_4_or_CircumflexAccentKeyword_0_6_or_ExclamationMarkKeyword_0_2_or_HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0_or_TildeKeyword_0_3_or_VerticalLineKeyword_0_5__q.equals(syntax))
				emit_unary_expr___AmpersandKeyword_0_4_or_CircumflexAccentKeyword_0_6_or_ExclamationMarkKeyword_0_2_or_HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0_or_TildeKeyword_0_3_or_VerticalLineKeyword_0_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     io_direction?
	 */
	protected void emit_action_portlist_Io_directionParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('.' ID)*
	 */
	protected void emit_hierarchical_id___FullStopKeyword_1_0_IDTerminalRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'int' | 'bit'
	 */
	protected void emit_integer_type_BitKeyword_1_1_or_IntKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'unsigned'? | 'signed'?
	 */
	protected void emit_primitive_datatype_SignedKeyword_0_0_q_or_UnsignedKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('unsigned' | 'signed')?
	 */
	protected void emit_primitive_datatype___SignedKeyword_0_0_or_UnsignedKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rand'?
	 */
	protected void emit_struct_data_declaration_RandKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '!' | 
	     '^' | 
	     '~' | 
	     '-' | 
	     '&' | 
	     '+' | 
	     '|'
	 )?
	 */
	protected void emit_unary_expr___AmpersandKeyword_0_4_or_CircumflexAccentKeyword_0_6_or_ExclamationMarkKeyword_0_2_or_HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0_or_TildeKeyword_0_3_or_VerticalLineKeyword_0_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
