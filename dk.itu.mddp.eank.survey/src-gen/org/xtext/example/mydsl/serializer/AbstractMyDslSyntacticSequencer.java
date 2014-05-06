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
	protected AbstractElementAlias match_ConstantSum_AKeyword_9_0_1_q;
	protected AbstractElementAlias match_ConstantSum_AnswerKeyword_7_1_or_DistributeKeyword_7_0;
	protected AbstractElementAlias match_ConstantSum_MayKeyword_5_0_q;
	protected AbstractElementAlias match_ConstantSum_OfKeyword_9_0_3_q;
	protected AbstractElementAlias match_ConstantSum_ToKeyword_6_q;
	protected AbstractElementAlias match_ConstantSum_ToKeyword_9_0_0_q;
	protected AbstractElementAlias match_ConstantSum___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_MultipleChoice_AnswerKeyword_7_q;
	protected AbstractElementAlias match_MultipleChoice_ElseKeyword_14_3_q;
	protected AbstractElementAlias match_MultipleChoice_FromKeyword_10_q;
	protected AbstractElementAlias match_MultipleChoice_MayKeyword_5_0_q;
	protected AbstractElementAlias match_MultipleChoice_SomethingKeyword_14_2_q;
	protected AbstractElementAlias match_MultipleChoice_TheseKeyword_11_q;
	protected AbstractElementAlias match_MultipleChoice_ToKeyword_6_q;
	protected AbstractElementAlias match_MultipleChoice_UpToKeyword_9_1_q;
	protected AbstractElementAlias match_MultipleChoice_WithKeyword_14_1_q;
	protected AbstractElementAlias match_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_Open_AnswerKeyword_7_q;
	protected AbstractElementAlias match_Open_MayKeyword_5_0_q;
	protected AbstractElementAlias match_Open_ToKeyword_6_q;
	protected AbstractElementAlias match_Open___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_RankingSumFork_BetweenKeyword_4_q;
	protected AbstractElementAlias match_RankingSumFork_ThenKeyword_8_q;
	protected AbstractElementAlias match_Ranking_FromKeyword_8_q;
	protected AbstractElementAlias match_Ranking_MayKeyword_4_0_q;
	protected AbstractElementAlias match_Ranking_TheseKeyword_10_q;
	protected AbstractElementAlias match_Ranking_ToKeyword_5_q;
	protected AbstractElementAlias match_Ranking___AnswerKeyword_6_1_or_RankKeyword_6_0__q;
	protected AbstractElementAlias match_Ranking___OneOfKeyword_9_0_or_SomeOfKeyword_9_1__q;
	protected AbstractElementAlias match_Ranking___TheKeyword_3_0_q_UserKeyword_3_1__q;
	protected AbstractElementAlias match_RatingFork_IsKeyword_2_q;
	protected AbstractElementAlias match_RatingFork_ItKeyword_1_q;
	protected AbstractElementAlias match_RatingFork_ThenKeyword_7_q;
	protected AbstractElementAlias match_Rating_Impl_AndKeyword_11_q;
	protected AbstractElementAlias match_Rating_Impl_AndKeyword_17_q;
	protected AbstractElementAlias match_Rating_Impl_BetweenKeyword_9_q;
	protected AbstractElementAlias match_Rating_Impl_HighestKeyword_18_q;
	protected AbstractElementAlias match_Rating_Impl_LowestKeyword_14_q;
	protected AbstractElementAlias match_Rating_Impl_MayKeyword_5_0_q_or___IsKeyword_5_1_0_RequiredKeyword_5_1_1__;
	protected AbstractElementAlias match_Rating_Impl_MeansKeyword_15_q;
	protected AbstractElementAlias match_Rating_Impl_MeansKeyword_19_q;
	protected AbstractElementAlias match_Rating_Impl_ToKeyword_6_q;
	protected AbstractElementAlias match_Rating_Impl_WhereKeyword_13_q;
	protected AbstractElementAlias match_Rating_Impl___AnswerKeyword_7_1_or_RateKeyword_7_0__q;
	protected AbstractElementAlias match_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q;
	protected AbstractElementAlias match_Staple_AndKeyword_11_q;
	protected AbstractElementAlias match_Staple_AndKeyword_21_q;
	protected AbstractElementAlias match_Staple_AnswerKeyword_7_1_or_RateKeyword_7_0;
	protected AbstractElementAlias match_Staple_BetweenKeyword_9_q;
	protected AbstractElementAlias match_Staple_CommaKeyword_17_q;
	protected AbstractElementAlias match_Staple_HighestKeyword_22_q;
	protected AbstractElementAlias match_Staple_LowestKeyword_14_q;
	protected AbstractElementAlias match_Staple_MayKeyword_5_0_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_15_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_19_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_23_q;
	protected AbstractElementAlias match_Staple_MidKeyword_18_q;
	protected AbstractElementAlias match_Staple_ToKeyword_6_q;
	protected AbstractElementAlias match_Staple_WhereKeyword_13_q;
	protected AbstractElementAlias match_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_ChoiceFork_ThenKeyword_3_q = new TokenAlias(false, true, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
		match_ConstantSum_AKeyword_9_0_1_q = new TokenAlias(false, true, grammarAccess.getConstantSumAccess().getAKeyword_9_0_1());
		match_ConstantSum_AnswerKeyword_7_1_or_DistributeKeyword_7_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstantSumAccess().getAnswerKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getConstantSumAccess().getDistributeKeyword_7_0()));
		match_ConstantSum_MayKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getConstantSumAccess().getMayKeyword_5_0());
		match_ConstantSum_OfKeyword_9_0_3_q = new TokenAlias(false, true, grammarAccess.getConstantSumAccess().getOfKeyword_9_0_3());
		match_ConstantSum_ToKeyword_6_q = new TokenAlias(false, true, grammarAccess.getConstantSumAccess().getToKeyword_6());
		match_ConstantSum_ToKeyword_9_0_0_q = new TokenAlias(false, true, grammarAccess.getConstantSumAccess().getToKeyword_9_0_0());
		match_ConstantSum___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getConstantSumAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getConstantSumAccess().getUserKeyword_4_1()));
		match_MultipleChoice_AnswerKeyword_7_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_7());
		match_MultipleChoice_ElseKeyword_14_3_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getElseKeyword_14_3());
		match_MultipleChoice_FromKeyword_10_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getFromKeyword_10());
		match_MultipleChoice_MayKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getMayKeyword_5_0());
		match_MultipleChoice_SomethingKeyword_14_2_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_14_2());
		match_MultipleChoice_TheseKeyword_11_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_11());
		match_MultipleChoice_ToKeyword_6_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getToKeyword_6());
		match_MultipleChoice_UpToKeyword_9_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getUpToKeyword_9_1());
		match_MultipleChoice_WithKeyword_14_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getWithKeyword_14_1());
		match_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getUserKeyword_4_1()));
		match_Open_AnswerKeyword_7_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getAnswerKeyword_7());
		match_Open_MayKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getMayKeyword_5_0());
		match_Open_ToKeyword_6_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getToKeyword_6());
		match_Open___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getOpenAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getOpenAccess().getUserKeyword_4_1()));
		match_RankingSumFork_BetweenKeyword_4_q = new TokenAlias(false, true, grammarAccess.getRankingSumForkAccess().getBetweenKeyword_4());
		match_RankingSumFork_ThenKeyword_8_q = new TokenAlias(false, true, grammarAccess.getRankingSumForkAccess().getThenKeyword_8());
		match_Ranking_FromKeyword_8_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getFromKeyword_8());
		match_Ranking_MayKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getMayKeyword_4_0());
		match_Ranking_TheseKeyword_10_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getTheseKeyword_10());
		match_Ranking_ToKeyword_5_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getToKeyword_5());
		match_Ranking___AnswerKeyword_6_1_or_RankKeyword_6_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRankingAccess().getAnswerKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getRankingAccess().getRankKeyword_6_0()));
		match_Ranking___OneOfKeyword_9_0_or_SomeOfKeyword_9_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRankingAccess().getOneOfKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getRankingAccess().getSomeOfKeyword_9_1()));
		match_Ranking___TheKeyword_3_0_q_UserKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getRankingAccess().getTheKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getRankingAccess().getUserKeyword_3_1()));
		match_RatingFork_IsKeyword_2_q = new TokenAlias(false, true, grammarAccess.getRatingForkAccess().getIsKeyword_2());
		match_RatingFork_ItKeyword_1_q = new TokenAlias(false, true, grammarAccess.getRatingForkAccess().getItKeyword_1());
		match_RatingFork_ThenKeyword_7_q = new TokenAlias(false, true, grammarAccess.getRatingForkAccess().getThenKeyword_7());
		match_Rating_Impl_AndKeyword_11_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getAndKeyword_11());
		match_Rating_Impl_AndKeyword_17_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getAndKeyword_17());
		match_Rating_Impl_BetweenKeyword_9_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getBetweenKeyword_9());
		match_Rating_Impl_HighestKeyword_18_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getHighestKeyword_18());
		match_Rating_Impl_LowestKeyword_14_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getLowestKeyword_14());
		match_Rating_Impl_MayKeyword_5_0_q_or___IsKeyword_5_1_0_RequiredKeyword_5_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getIsKeyword_5_1_0()), new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getRequiredKeyword_5_1_1())), new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0()));
		match_Rating_Impl_MeansKeyword_15_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getMeansKeyword_15());
		match_Rating_Impl_MeansKeyword_19_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getMeansKeyword_19());
		match_Rating_Impl_ToKeyword_6_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getToKeyword_6());
		match_Rating_Impl_WhereKeyword_13_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getWhereKeyword_13());
		match_Rating_Impl___AnswerKeyword_7_1_or_RateKeyword_7_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getAnswerKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getRateKeyword_7_0()));
		match_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1()));
		match_Staple_AndKeyword_11_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getAndKeyword_11());
		match_Staple_AndKeyword_21_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getAndKeyword_21());
		match_Staple_AnswerKeyword_7_1_or_RateKeyword_7_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStapleAccess().getAnswerKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getStapleAccess().getRateKeyword_7_0()));
		match_Staple_BetweenKeyword_9_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getBetweenKeyword_9());
		match_Staple_CommaKeyword_17_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getCommaKeyword_17());
		match_Staple_HighestKeyword_22_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getHighestKeyword_22());
		match_Staple_LowestKeyword_14_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getLowestKeyword_14());
		match_Staple_MayKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMayKeyword_5_0());
		match_Staple_MeansKeyword_15_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_15());
		match_Staple_MeansKeyword_19_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_19());
		match_Staple_MeansKeyword_23_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_23());
		match_Staple_MidKeyword_18_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMidKeyword_18());
		match_Staple_ToKeyword_6_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getToKeyword_6());
		match_Staple_WhereKeyword_13_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getWhereKeyword_13());
		match_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getStapleAccess().getTheKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getStapleAccess().getUserKeyword_4_1()));
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
			else if(match_ConstantSum_AKeyword_9_0_1_q.equals(syntax))
				emit_ConstantSum_AKeyword_9_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantSum_AnswerKeyword_7_1_or_DistributeKeyword_7_0.equals(syntax))
				emit_ConstantSum_AnswerKeyword_7_1_or_DistributeKeyword_7_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantSum_MayKeyword_5_0_q.equals(syntax))
				emit_ConstantSum_MayKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantSum_OfKeyword_9_0_3_q.equals(syntax))
				emit_ConstantSum_OfKeyword_9_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantSum_ToKeyword_6_q.equals(syntax))
				emit_ConstantSum_ToKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantSum_ToKeyword_9_0_0_q.equals(syntax))
				emit_ConstantSum_ToKeyword_9_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstantSum___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_ConstantSum___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_AnswerKeyword_7_q.equals(syntax))
				emit_MultipleChoice_AnswerKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ElseKeyword_14_3_q.equals(syntax))
				emit_MultipleChoice_ElseKeyword_14_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_FromKeyword_10_q.equals(syntax))
				emit_MultipleChoice_FromKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_MayKeyword_5_0_q.equals(syntax))
				emit_MultipleChoice_MayKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_SomethingKeyword_14_2_q.equals(syntax))
				emit_MultipleChoice_SomethingKeyword_14_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_TheseKeyword_11_q.equals(syntax))
				emit_MultipleChoice_TheseKeyword_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ToKeyword_6_q.equals(syntax))
				emit_MultipleChoice_ToKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_UpToKeyword_9_1_q.equals(syntax))
				emit_MultipleChoice_UpToKeyword_9_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_WithKeyword_14_1_q.equals(syntax))
				emit_MultipleChoice_WithKeyword_14_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_AnswerKeyword_7_q.equals(syntax))
				emit_Open_AnswerKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_MayKeyword_5_0_q.equals(syntax))
				emit_Open_MayKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_ToKeyword_6_q.equals(syntax))
				emit_Open_ToKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_Open___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RankingSumFork_BetweenKeyword_4_q.equals(syntax))
				emit_RankingSumFork_BetweenKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RankingSumFork_ThenKeyword_8_q.equals(syntax))
				emit_RankingSumFork_ThenKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_FromKeyword_8_q.equals(syntax))
				emit_Ranking_FromKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_MayKeyword_4_0_q.equals(syntax))
				emit_Ranking_MayKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_TheseKeyword_10_q.equals(syntax))
				emit_Ranking_TheseKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_ToKeyword_5_q.equals(syntax))
				emit_Ranking_ToKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking___AnswerKeyword_6_1_or_RankKeyword_6_0__q.equals(syntax))
				emit_Ranking___AnswerKeyword_6_1_or_RankKeyword_6_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking___OneOfKeyword_9_0_or_SomeOfKeyword_9_1__q.equals(syntax))
				emit_Ranking___OneOfKeyword_9_0_or_SomeOfKeyword_9_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking___TheKeyword_3_0_q_UserKeyword_3_1__q.equals(syntax))
				emit_Ranking___TheKeyword_3_0_q_UserKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RatingFork_IsKeyword_2_q.equals(syntax))
				emit_RatingFork_IsKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RatingFork_ItKeyword_1_q.equals(syntax))
				emit_RatingFork_ItKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RatingFork_ThenKeyword_7_q.equals(syntax))
				emit_RatingFork_ThenKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_AndKeyword_11_q.equals(syntax))
				emit_Rating_Impl_AndKeyword_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_AndKeyword_17_q.equals(syntax))
				emit_Rating_Impl_AndKeyword_17_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_BetweenKeyword_9_q.equals(syntax))
				emit_Rating_Impl_BetweenKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_HighestKeyword_18_q.equals(syntax))
				emit_Rating_Impl_HighestKeyword_18_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_LowestKeyword_14_q.equals(syntax))
				emit_Rating_Impl_LowestKeyword_14_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_MayKeyword_5_0_q_or___IsKeyword_5_1_0_RequiredKeyword_5_1_1__.equals(syntax))
				emit_Rating_Impl_MayKeyword_5_0_q_or___IsKeyword_5_1_0_RequiredKeyword_5_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_MeansKeyword_15_q.equals(syntax))
				emit_Rating_Impl_MeansKeyword_15_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_MeansKeyword_19_q.equals(syntax))
				emit_Rating_Impl_MeansKeyword_19_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_ToKeyword_6_q.equals(syntax))
				emit_Rating_Impl_ToKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_WhereKeyword_13_q.equals(syntax))
				emit_Rating_Impl_WhereKeyword_13_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl___AnswerKeyword_7_1_or_RateKeyword_7_0__q.equals(syntax))
				emit_Rating_Impl___AnswerKeyword_7_1_or_RateKeyword_7_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_AndKeyword_11_q.equals(syntax))
				emit_Staple_AndKeyword_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_AndKeyword_21_q.equals(syntax))
				emit_Staple_AndKeyword_21_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_AnswerKeyword_7_1_or_RateKeyword_7_0.equals(syntax))
				emit_Staple_AnswerKeyword_7_1_or_RateKeyword_7_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_BetweenKeyword_9_q.equals(syntax))
				emit_Staple_BetweenKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_CommaKeyword_17_q.equals(syntax))
				emit_Staple_CommaKeyword_17_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_HighestKeyword_22_q.equals(syntax))
				emit_Staple_HighestKeyword_22_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_LowestKeyword_14_q.equals(syntax))
				emit_Staple_LowestKeyword_14_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MayKeyword_5_0_q.equals(syntax))
				emit_Staple_MayKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_15_q.equals(syntax))
				emit_Staple_MeansKeyword_15_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_19_q.equals(syntax))
				emit_Staple_MeansKeyword_19_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_23_q.equals(syntax))
				emit_Staple_MeansKeyword_23_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MidKeyword_18_q.equals(syntax))
				emit_Staple_MidKeyword_18_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_ToKeyword_6_q.equals(syntax))
				emit_Staple_ToKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_WhereKeyword_13_q.equals(syntax))
				emit_Staple_WhereKeyword_13_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q.equals(syntax))
				emit_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     'a'?
	 */
	protected void emit_ConstantSum_AKeyword_9_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'distribute' | 'answer'
	 */
	protected void emit_ConstantSum_AnswerKeyword_7_1_or_DistributeKeyword_7_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'may'?
	 */
	protected void emit_ConstantSum_MayKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'of'?
	 */
	protected void emit_ConstantSum_OfKeyword_9_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_ConstantSum_ToKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_ConstantSum_ToKeyword_9_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('the'? 'user')?
	 */
	protected void emit_ConstantSum___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_MultipleChoice_AnswerKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else'?
	 */
	protected void emit_MultipleChoice_ElseKeyword_14_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'from'?
	 */
	protected void emit_MultipleChoice_FromKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_MultipleChoice_SomethingKeyword_14_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'these'?
	 */
	protected void emit_MultipleChoice_TheseKeyword_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_MultipleChoice_ToKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'up to'?
	 */
	protected void emit_MultipleChoice_UpToKeyword_9_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_MultipleChoice_WithKeyword_14_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('the'? 'user')?
	 */
	protected void emit_MultipleChoice___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_Open_AnswerKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'may'?
	 */
	protected void emit_Open_MayKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Open_ToKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('the'? 'user')?
	 */
	protected void emit_Open___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'between'?
	 */
	protected void emit_RankingSumFork_BetweenKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'then'?
	 */
	protected void emit_RankingSumFork_ThenKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'from'?
	 */
	protected void emit_Ranking_FromKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'may'?
	 */
	protected void emit_Ranking_MayKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'these'?
	 */
	protected void emit_Ranking_TheseKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Ranking_ToKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('answer' | 'rank')?
	 */
	protected void emit_Ranking___AnswerKeyword_6_1_or_RankKeyword_6_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('one of' | 'some of')?
	 */
	protected void emit_Ranking___OneOfKeyword_9_0_or_SomeOfKeyword_9_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('the'? 'user')?
	 */
	protected void emit_Ranking___TheKeyword_3_0_q_UserKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is'?
	 */
	protected void emit_RatingFork_IsKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'it'?
	 */
	protected void emit_RatingFork_ItKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'then'?
	 */
	protected void emit_RatingFork_ThenKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Rating_Impl_AndKeyword_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Rating_Impl_AndKeyword_17_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'between'?
	 */
	protected void emit_Rating_Impl_BetweenKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'highest'?
	 */
	protected void emit_Rating_Impl_HighestKeyword_18_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'lowest'?
	 */
	protected void emit_Rating_Impl_LowestKeyword_14_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is' 'required') | 'may'?
	 */
	protected void emit_Rating_Impl_MayKeyword_5_0_q_or___IsKeyword_5_1_0_RequiredKeyword_5_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Rating_Impl_MeansKeyword_15_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Rating_Impl_MeansKeyword_19_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Rating_Impl_ToKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'where'?
	 */
	protected void emit_Rating_Impl_WhereKeyword_13_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('rate' | 'answer')?
	 */
	protected void emit_Rating_Impl___AnswerKeyword_7_1_or_RateKeyword_7_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('the'? 'user')?
	 */
	protected void emit_Rating_Impl___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Staple_AndKeyword_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Staple_AndKeyword_21_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer' | 'rate'
	 */
	protected void emit_Staple_AnswerKeyword_7_1_or_RateKeyword_7_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'between'?
	 */
	protected void emit_Staple_BetweenKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Staple_CommaKeyword_17_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'highest'?
	 */
	protected void emit_Staple_HighestKeyword_22_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'lowest'?
	 */
	protected void emit_Staple_LowestKeyword_14_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'may'?
	 */
	protected void emit_Staple_MayKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_15_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_19_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_23_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'mid'?
	 */
	protected void emit_Staple_MidKeyword_18_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Staple_ToKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'where'?
	 */
	protected void emit_Staple_WhereKeyword_13_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('the'? 'user')?
	 */
	protected void emit_Staple___TheKeyword_4_0_q_UserKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
