package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ChoiceFork_ThenKeyword_3_q;
	protected AbstractElementAlias match_Dichotomous_AnswerKeyword_6_1_q;
	protected AbstractElementAlias match_Dichotomous_ToKeyword_6_0_q;
	protected AbstractElementAlias match_Dichotomous___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q;
	protected AbstractElementAlias match_Dichotomous___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_MultipleChoice_AnswerKeyword_6_1_q;
	protected AbstractElementAlias match_MultipleChoice_ElseKeyword_8_3_q;
	protected AbstractElementAlias match_MultipleChoice_FullStopKeyword_9_q;
	protected AbstractElementAlias match_MultipleChoice_MayKeyword_5_0_q;
	protected AbstractElementAlias match_MultipleChoice_SomethingKeyword_8_2_q;
	protected AbstractElementAlias match_MultipleChoice_TheseKeyword_7_2_q;
	protected AbstractElementAlias match_MultipleChoice_ToKeyword_6_0_q;
	protected AbstractElementAlias match_MultipleChoice_WithKeyword_7_0_q;
	protected AbstractElementAlias match_MultipleChoice_WithKeyword_8_1_q;
	protected AbstractElementAlias match_MultipleChoice___OneOfKeyword_7_1_0_or_SomeOfKeyword_7_1_1__q;
	protected AbstractElementAlias match_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_Open_AnswerKeyword_6_1_q;
	protected AbstractElementAlias match_Open_ToKeyword_6_0_q;
	protected AbstractElementAlias match_Open___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q;
	protected AbstractElementAlias match_Open___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_Ranking_AskKeyword_4_0_q;
	protected AbstractElementAlias match_Ranking_CanKeyword_5_1_q;
	protected AbstractElementAlias match_Ranking_ConditionalsKeyword_6_0_q;
	protected AbstractElementAlias match_Ranking_FromKeyword_5_3_q;
	protected AbstractElementAlias match_Ranking_IsRequiredKeyword_3_q;
	protected AbstractElementAlias match_Ranking_TheseKeyword_5_4_q;
	protected AbstractElementAlias match_Ranking_YouKeyword_5_0_q;
	protected AbstractElementAlias match_Rating_Impl_AndKeyword_10_0_q;
	protected AbstractElementAlias match_Rating_Impl_AndKeyword_8_0_q;
	protected AbstractElementAlias match_Rating_Impl_BetweenKeyword_7_0_q;
	protected AbstractElementAlias match_Rating_Impl_ConditionalsKeyword_11_0_q;
	protected AbstractElementAlias match_Rating_Impl_HighestKeyword_10_1_q;
	protected AbstractElementAlias match_Rating_Impl_LowestKeyword_9_1_q;
	protected AbstractElementAlias match_Rating_Impl_MeansKeyword_10_2_q;
	protected AbstractElementAlias match_Rating_Impl_MeansKeyword_9_2_q;
	protected AbstractElementAlias match_Rating_Impl_RateKeyword_6_1_q;
	protected AbstractElementAlias match_Rating_Impl_ToKeyword_6_0_q;
	protected AbstractElementAlias match_Rating_Impl_WhereKeyword_9_0_q;
	protected AbstractElementAlias match_Rating_Impl___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q;
	protected AbstractElementAlias match_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_Staple_AndKeyword_11_0_q;
	protected AbstractElementAlias match_Staple_AndKeyword_8_0_q;
	protected AbstractElementAlias match_Staple_BetweenKeyword_7_0_q;
	protected AbstractElementAlias match_Staple_CommaKeyword_9_3_q;
	protected AbstractElementAlias match_Staple_ConditionalsKeyword_12_0_q;
	protected AbstractElementAlias match_Staple_HighestKeyword_11_1_q;
	protected AbstractElementAlias match_Staple_LowestKeyword_9_1_q;
	protected AbstractElementAlias match_Staple_MeanKeyword_10_0_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_10_1_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_11_2_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_9_2_q;
	protected AbstractElementAlias match_Staple_RateKeyword_6_1_q;
	protected AbstractElementAlias match_Staple_ToKeyword_6_0_q;
	protected AbstractElementAlias match_Staple_WhereKeyword_9_0_q;
	protected AbstractElementAlias match_Staple___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q;
	protected AbstractElementAlias match_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_SumConstant_AccordingKeyword_6_2_q;
	protected AbstractElementAlias match_SumConstant_ConditionalsKeyword_7_0_q;
	protected AbstractElementAlias match_SumConstant_DivideKeyword_6_1_q;
	protected AbstractElementAlias match_SumConstant_ImportanceKeyword_6_5_q;
	protected AbstractElementAlias match_SumConstant_TheKeyword_6_4_q;
	protected AbstractElementAlias match_SumConstant_ToKeyword_6_0_q;
	protected AbstractElementAlias match_SumConstant_ToKeyword_6_3_q;
	protected AbstractElementAlias match_SumConstant___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q;
	protected AbstractElementAlias match_SumConstant___TheKeyword_4_0_q_UserKeyword_4_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_ChoiceFork_ThenKeyword_3_q = new TokenAlias(false, true, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
		match_Dichotomous_AnswerKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getDichotomousAccess().getAnswerKeyword_6_1());
		match_Dichotomous_ToKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getDichotomousAccess().getToKeyword_6_0());
		match_Dichotomous___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDichotomousAccess().getIsRequiredKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getDichotomousAccess().getMayKeyword_5_0()));
		match_Dichotomous___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getDichotomousAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getDichotomousAccess().getUserKeyword_4_1()));
		match_MultipleChoice_AnswerKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_6_1());
		match_MultipleChoice_ElseKeyword_8_3_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getElseKeyword_8_3());
		match_MultipleChoice_FullStopKeyword_9_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getFullStopKeyword_9());
		match_MultipleChoice_MayKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getMayKeyword_5_0());
		match_MultipleChoice_SomethingKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_8_2());
		match_MultipleChoice_TheseKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_7_2());
		match_MultipleChoice_ToKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getToKeyword_6_0());
		match_MultipleChoice_WithKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getWithKeyword_7_0());
		match_MultipleChoice_WithKeyword_8_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getWithKeyword_8_1());
		match_MultipleChoice___OneOfKeyword_7_1_0_or_SomeOfKeyword_7_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getOneOfKeyword_7_1_0()), new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getSomeOfKeyword_7_1_1()));
		match_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getUserKeyword_4_1()));
		match_Open_AnswerKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getAnswerKeyword_6_1());
		match_Open_ToKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getToKeyword_6_0());
		match_Open___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getOpenAccess().getIsRequiredKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getOpenAccess().getMayKeyword_5_0()));
		match_Open___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getOpenAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getOpenAccess().getUserKeyword_4_1()));
		match_Ranking_AskKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getAskKeyword_4_0());
		match_Ranking_CanKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getCanKeyword_5_1());
		match_Ranking_ConditionalsKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getConditionalsKeyword_6_0());
		match_Ranking_FromKeyword_5_3_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getFromKeyword_5_3());
		match_Ranking_IsRequiredKeyword_3_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getIsRequiredKeyword_3());
		match_Ranking_TheseKeyword_5_4_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getTheseKeyword_5_4());
		match_Ranking_YouKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getYouKeyword_5_0());
		match_Rating_Impl_AndKeyword_10_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getAndKeyword_10_0());
		match_Rating_Impl_AndKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getAndKeyword_8_0());
		match_Rating_Impl_BetweenKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getBetweenKeyword_7_0());
		match_Rating_Impl_ConditionalsKeyword_11_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getConditionalsKeyword_11_0());
		match_Rating_Impl_HighestKeyword_10_1_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getHighestKeyword_10_1());
		match_Rating_Impl_LowestKeyword_9_1_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getLowestKeyword_9_1());
		match_Rating_Impl_MeansKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getMeansKeyword_10_2());
		match_Rating_Impl_MeansKeyword_9_2_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getMeansKeyword_9_2());
		match_Rating_Impl_RateKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getRateKeyword_6_1());
		match_Rating_Impl_ToKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getToKeyword_6_0());
		match_Rating_Impl_WhereKeyword_9_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getWhereKeyword_9_0());
		match_Rating_Impl___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getIsRequiredKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0()));
		match_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1()));
		match_Staple_AndKeyword_11_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getAndKeyword_11_0());
		match_Staple_AndKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getAndKeyword_8_0());
		match_Staple_BetweenKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getBetweenKeyword_7_0());
		match_Staple_CommaKeyword_9_3_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getCommaKeyword_9_3());
		match_Staple_ConditionalsKeyword_12_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getConditionalsKeyword_12_0());
		match_Staple_HighestKeyword_11_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getHighestKeyword_11_1());
		match_Staple_LowestKeyword_9_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getLowestKeyword_9_1());
		match_Staple_MeanKeyword_10_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeanKeyword_10_0());
		match_Staple_MeansKeyword_10_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_10_1());
		match_Staple_MeansKeyword_11_2_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_11_2());
		match_Staple_MeansKeyword_9_2_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_9_2());
		match_Staple_RateKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getRateKeyword_6_1());
		match_Staple_ToKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getToKeyword_6_0());
		match_Staple_WhereKeyword_9_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getWhereKeyword_9_0());
		match_Staple___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getStapleAccess().getIsRequiredKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getStapleAccess().getMayKeyword_5_0()));
		match_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getStapleAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getStapleAccess().getUserKeyword_4_1()));
		match_SumConstant_AccordingKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getAccordingKeyword_6_2());
		match_SumConstant_ConditionalsKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getConditionalsKeyword_7_0());
		match_SumConstant_DivideKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getDivideKeyword_6_1());
		match_SumConstant_ImportanceKeyword_6_5_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getImportanceKeyword_6_5());
		match_SumConstant_TheKeyword_6_4_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getTheKeyword_6_4());
		match_SumConstant_ToKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getToKeyword_6_0());
		match_SumConstant_ToKeyword_6_3_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getToKeyword_6_3());
		match_SumConstant___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSumConstantAccess().getIsRequiredKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getSumConstantAccess().getMayKeyword_5_0()));
		match_SumConstant___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getSumConstantAccess().getUserKeyword_4_1()));
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
			if(match_ChoiceFork_ThenKeyword_3_q.equals(syntax))
				emit_ChoiceFork_ThenKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dichotomous_AnswerKeyword_6_1_q.equals(syntax))
				emit_Dichotomous_AnswerKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dichotomous_ToKeyword_6_0_q.equals(syntax))
				emit_Dichotomous_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dichotomous___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q.equals(syntax))
				emit_Dichotomous___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dichotomous___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_Dichotomous___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_AnswerKeyword_6_1_q.equals(syntax))
				emit_MultipleChoice_AnswerKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ElseKeyword_8_3_q.equals(syntax))
				emit_MultipleChoice_ElseKeyword_8_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_FullStopKeyword_9_q.equals(syntax))
				emit_MultipleChoice_FullStopKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_MayKeyword_5_0_q.equals(syntax))
				emit_MultipleChoice_MayKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_SomethingKeyword_8_2_q.equals(syntax))
				emit_MultipleChoice_SomethingKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_TheseKeyword_7_2_q.equals(syntax))
				emit_MultipleChoice_TheseKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ToKeyword_6_0_q.equals(syntax))
				emit_MultipleChoice_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_WithKeyword_7_0_q.equals(syntax))
				emit_MultipleChoice_WithKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_WithKeyword_8_1_q.equals(syntax))
				emit_MultipleChoice_WithKeyword_8_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice___OneOfKeyword_7_1_0_or_SomeOfKeyword_7_1_1__q.equals(syntax))
				emit_MultipleChoice___OneOfKeyword_7_1_0_or_SomeOfKeyword_7_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_AnswerKeyword_6_1_q.equals(syntax))
				emit_Open_AnswerKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_ToKeyword_6_0_q.equals(syntax))
				emit_Open_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q.equals(syntax))
				emit_Open___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_Open___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_AskKeyword_4_0_q.equals(syntax))
				emit_Ranking_AskKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_CanKeyword_5_1_q.equals(syntax))
				emit_Ranking_CanKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_ConditionalsKeyword_6_0_q.equals(syntax))
				emit_Ranking_ConditionalsKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_FromKeyword_5_3_q.equals(syntax))
				emit_Ranking_FromKeyword_5_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_IsRequiredKeyword_3_q.equals(syntax))
				emit_Ranking_IsRequiredKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_TheseKeyword_5_4_q.equals(syntax))
				emit_Ranking_TheseKeyword_5_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_YouKeyword_5_0_q.equals(syntax))
				emit_Ranking_YouKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_AndKeyword_10_0_q.equals(syntax))
				emit_Rating_Impl_AndKeyword_10_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_AndKeyword_8_0_q.equals(syntax))
				emit_Rating_Impl_AndKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_BetweenKeyword_7_0_q.equals(syntax))
				emit_Rating_Impl_BetweenKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_ConditionalsKeyword_11_0_q.equals(syntax))
				emit_Rating_Impl_ConditionalsKeyword_11_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_HighestKeyword_10_1_q.equals(syntax))
				emit_Rating_Impl_HighestKeyword_10_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_LowestKeyword_9_1_q.equals(syntax))
				emit_Rating_Impl_LowestKeyword_9_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_MeansKeyword_10_2_q.equals(syntax))
				emit_Rating_Impl_MeansKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_MeansKeyword_9_2_q.equals(syntax))
				emit_Rating_Impl_MeansKeyword_9_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_RateKeyword_6_1_q.equals(syntax))
				emit_Rating_Impl_RateKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_ToKeyword_6_0_q.equals(syntax))
				emit_Rating_Impl_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_WhereKeyword_9_0_q.equals(syntax))
				emit_Rating_Impl_WhereKeyword_9_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q.equals(syntax))
				emit_Rating_Impl___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_AndKeyword_11_0_q.equals(syntax))
				emit_Staple_AndKeyword_11_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_AndKeyword_8_0_q.equals(syntax))
				emit_Staple_AndKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_BetweenKeyword_7_0_q.equals(syntax))
				emit_Staple_BetweenKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_CommaKeyword_9_3_q.equals(syntax))
				emit_Staple_CommaKeyword_9_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_ConditionalsKeyword_12_0_q.equals(syntax))
				emit_Staple_ConditionalsKeyword_12_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_HighestKeyword_11_1_q.equals(syntax))
				emit_Staple_HighestKeyword_11_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_LowestKeyword_9_1_q.equals(syntax))
				emit_Staple_LowestKeyword_9_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeanKeyword_10_0_q.equals(syntax))
				emit_Staple_MeanKeyword_10_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_10_1_q.equals(syntax))
				emit_Staple_MeansKeyword_10_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_11_2_q.equals(syntax))
				emit_Staple_MeansKeyword_11_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_9_2_q.equals(syntax))
				emit_Staple_MeansKeyword_9_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_RateKeyword_6_1_q.equals(syntax))
				emit_Staple_RateKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_ToKeyword_6_0_q.equals(syntax))
				emit_Staple_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_WhereKeyword_9_0_q.equals(syntax))
				emit_Staple_WhereKeyword_9_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q.equals(syntax))
				emit_Staple___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_AccordingKeyword_6_2_q.equals(syntax))
				emit_SumConstant_AccordingKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_ConditionalsKeyword_7_0_q.equals(syntax))
				emit_SumConstant_ConditionalsKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_DivideKeyword_6_1_q.equals(syntax))
				emit_SumConstant_DivideKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_ImportanceKeyword_6_5_q.equals(syntax))
				emit_SumConstant_ImportanceKeyword_6_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_TheKeyword_6_4_q.equals(syntax))
				emit_SumConstant_TheKeyword_6_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_ToKeyword_6_0_q.equals(syntax))
				emit_SumConstant_ToKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_ToKeyword_6_3_q.equals(syntax))
				emit_SumConstant_ToKeyword_6_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q.equals(syntax))
				emit_SumConstant___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_SumConstant___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'then'?
	 */
	protected void emit_ChoiceFork_ThenKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_Dichotomous_AnswerKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Dichotomous_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is required' | 'may')?
	 */
	protected void emit_Dichotomous___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Dichotomous___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_MultipleChoice_AnswerKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else'?
	 */
	protected void emit_MultipleChoice_ElseKeyword_8_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '.'?
	 */
	protected void emit_MultipleChoice_FullStopKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'may'?
	 */
	protected void emit_MultipleChoice_MayKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'something'?
	 */
	protected void emit_MultipleChoice_SomethingKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'these:'?
	 */
	protected void emit_MultipleChoice_TheseKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_MultipleChoice_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_MultipleChoice_WithKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_MultipleChoice_WithKeyword_8_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('one of' | 'some of')?
	 */
	protected void emit_MultipleChoice___OneOfKeyword_7_1_0_or_SomeOfKeyword_7_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_Open_AnswerKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Open_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('may' | 'is required')?
	 */
	protected void emit_Open___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Open___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'ask'?
	 */
	protected void emit_Ranking_AskKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'can'?
	 */
	protected void emit_Ranking_CanKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conditionals'?
	 */
	protected void emit_Ranking_ConditionalsKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'from'?
	 */
	protected void emit_Ranking_FromKeyword_5_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is required'?
	 */
	protected void emit_Ranking_IsRequiredKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'these'?
	 */
	protected void emit_Ranking_TheseKeyword_5_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'you'?
	 */
	protected void emit_Ranking_YouKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Rating_Impl_AndKeyword_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Rating_Impl_AndKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'between'?
	 */
	protected void emit_Rating_Impl_BetweenKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conditionals'?
	 */
	protected void emit_Rating_Impl_ConditionalsKeyword_11_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'highest'?
	 */
	protected void emit_Rating_Impl_HighestKeyword_10_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'lowest'?
	 */
	protected void emit_Rating_Impl_LowestKeyword_9_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Rating_Impl_MeansKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Rating_Impl_MeansKeyword_9_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rate'?
	 */
	protected void emit_Rating_Impl_RateKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Rating_Impl_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'where'?
	 */
	protected void emit_Rating_Impl_WhereKeyword_9_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is required' | 'may')?
	 */
	protected void emit_Rating_Impl___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Staple_AndKeyword_11_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Staple_AndKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'between'?
	 */
	protected void emit_Staple_BetweenKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Staple_CommaKeyword_9_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conditionals'?
	 */
	protected void emit_Staple_ConditionalsKeyword_12_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'highest'?
	 */
	protected void emit_Staple_HighestKeyword_11_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'lowest'?
	 */
	protected void emit_Staple_LowestKeyword_9_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'mean'?
	 */
	protected void emit_Staple_MeanKeyword_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_10_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_11_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_9_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rate'?
	 */
	protected void emit_Staple_RateKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Staple_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'where'?
	 */
	protected void emit_Staple_WhereKeyword_9_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is required' | 'may')?
	 */
	protected void emit_Staple___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'according'?
	 */
	protected void emit_SumConstant_AccordingKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conditionals'?
	 */
	protected void emit_SumConstant_ConditionalsKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'divide'?
	 */
	protected void emit_SumConstant_DivideKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'importance'?
	 */
	protected void emit_SumConstant_ImportanceKeyword_6_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'the'?
	 */
	protected void emit_SumConstant_TheKeyword_6_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_SumConstant_ToKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_SumConstant_ToKeyword_6_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is required' | 'may')?
	 */
	protected void emit_SumConstant___IsRequiredKeyword_5_1_or_MayKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_SumConstant___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
