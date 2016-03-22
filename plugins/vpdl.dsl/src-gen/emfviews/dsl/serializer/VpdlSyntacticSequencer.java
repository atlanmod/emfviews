package emfviews.dsl.serializer;

import com.google.inject.Inject;
import emfviews.dsl.services.VpdlGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class VpdlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VpdlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Comparison_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_4_or_LessThanSignEqualsSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3;
	protected AbstractElementAlias match_Condition_AndKeyword_1_0_0_or_OrKeyword_1_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VpdlGrammarAccess) access;
		match_Comparison_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_4_or_LessThanSignEqualsSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getComparisonAccess().getLessThanSignGreaterThanSignKeyword_1_5()), new TokenAlias(false, false, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_3()));
		match_Condition_AndKeyword_1_0_0_or_OrKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getAndKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getOrKeyword_1_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Comparison_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_4_or_LessThanSignEqualsSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3.equals(syntax))
				emit_Comparison_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_4_or_LessThanSignEqualsSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Condition_AndKeyword_1_0_0_or_OrKeyword_1_0_1.equals(syntax))
				emit_Condition_AndKeyword_1_0_0_or_OrKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (
	     '=' | 
	     '<=' | 
	     '>=' | 
	     '<' | 
	     '>' | 
	     '<>'
	 )
	 */
	protected void emit_Comparison_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_4_or_LessThanSignEqualsSignKeyword_1_1_or_LessThanSignGreaterThanSignKeyword_1_5_or_LessThanSignKeyword_1_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and' | 'or'
	 */
	protected void emit_Condition_AndKeyword_1_0_0_or_OrKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
