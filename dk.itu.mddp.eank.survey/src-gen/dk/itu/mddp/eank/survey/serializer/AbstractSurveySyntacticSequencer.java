package dk.itu.mddp.eank.survey.serializer;

import com.google.inject.Inject;
import dk.itu.mddp.eank.survey.services.SurveyGrammarAccess;
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

@SuppressWarnings("all")
public abstract class AbstractSurveySyntacticSequencer extends AbstractSyntacticSequencer {

	protected SurveyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Dichotomous_AnswerKeyword_5_1_q;
	protected AbstractElementAlias match_Dichotomous_ToKeyword_5_0_q;
	protected AbstractElementAlias match_Dichotomous___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q;
	protected AbstractElementAlias match_Dichotomous___TheKeyword_3_0_q_UserKeyword_3_1__q;
	protected AbstractElementAlias match_MultipleChoice_AnswerKeyword_5_1_q;
	protected AbstractElementAlias match_MultipleChoice_ConditionalsKeyword_8_0_q;
	protected AbstractElementAlias match_MultipleChoice_ElseKeyword_7_3_q;
	protected AbstractElementAlias match_MultipleChoice_IsRequiredKeyword_4_1_q_or_MayKeyword_4_0_q;
	protected AbstractElementAlias match_MultipleChoice_SomethingKeyword_7_2_q;
	protected AbstractElementAlias match_MultipleChoice_TheseKeyword_6_2_q;
	protected AbstractElementAlias match_MultipleChoice_ToKeyword_5_0_q;
	protected AbstractElementAlias match_MultipleChoice_WithKeyword_6_0_q;
	protected AbstractElementAlias match_MultipleChoice_WithKeyword_7_1_q;
	protected AbstractElementAlias match_MultipleChoice___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q;
	protected AbstractElementAlias match_MultipleChoice___OneKeyword_6_1_0_or_SomeOfKeyword_6_1_1__q;
	protected AbstractElementAlias match_MultipleChoice___TheKeyword_3_0_q_UserKeyword_3_1__q;
	protected AbstractElementAlias match_Open_AnswerKeyword_5_1_q;
	protected AbstractElementAlias match_Open_ToKeyword_5_0_q;
	protected AbstractElementAlias match_Open___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q;
	protected AbstractElementAlias match_Open___TheKeyword_3_0_q_UserKeyword_3_1__q;
	protected AbstractElementAlias match_RankingFork_MatchKeyword_4_q;
	protected AbstractElementAlias match_RankingFork_WithKeyword_5_q;
	protected AbstractElementAlias match_Ranking_AskKeyword_3_0_q;
	protected AbstractElementAlias match_Ranking_CanKeyword_4_1_q;
	protected AbstractElementAlias match_Ranking_ConditionalsKeyword_5_0_q;
	protected AbstractElementAlias match_Ranking_FromKeyword_4_3_q;
	protected AbstractElementAlias match_Ranking_IsRequiredKeyword_2_q;
	protected AbstractElementAlias match_Ranking_TheseKeyword_4_4_q;
	protected AbstractElementAlias match_Ranking_YouKeyword_4_0_q;
	protected AbstractElementAlias match_Rating_Impl_AndKeyword_7_0_q;
	protected AbstractElementAlias match_Rating_Impl_AndKeyword_9_0_q;
	protected AbstractElementAlias match_Rating_Impl_BetweenKeyword_6_0_q;
	protected AbstractElementAlias match_Rating_Impl_ConditionalsKeyword_10_0_q;
	protected AbstractElementAlias match_Rating_Impl_HighestKeyword_9_1_q;
	protected AbstractElementAlias match_Rating_Impl_LowestKeyword_8_1_q;
	protected AbstractElementAlias match_Rating_Impl_MeansKeyword_8_2_q;
	protected AbstractElementAlias match_Rating_Impl_MeansKeyword_9_2_q;
	protected AbstractElementAlias match_Rating_Impl_RateKeyword_5_1_q;
	protected AbstractElementAlias match_Rating_Impl_ToKeyword_5_0_q;
	protected AbstractElementAlias match_Rating_Impl_WhereKeyword_8_0_q;
	protected AbstractElementAlias match_Rating_Impl___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q;
	protected AbstractElementAlias match_Rating_Impl___TheKeyword_3_0_q_UserKeyword_3_1__q;
	protected AbstractElementAlias match_Staple_AndKeyword_10_0_q;
	protected AbstractElementAlias match_Staple_AndKeyword_7_0_q;
	protected AbstractElementAlias match_Staple_BetweenKeyword_6_0_q;
	protected AbstractElementAlias match_Staple_CommaKeyword_8_3_q;
	protected AbstractElementAlias match_Staple_HighestKeyword_10_1_q;
	protected AbstractElementAlias match_Staple_LowestKeyword_8_1_q;
	protected AbstractElementAlias match_Staple_MeanKeyword_9_0_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_10_2_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_8_2_q;
	protected AbstractElementAlias match_Staple_MeansKeyword_9_1_q;
	protected AbstractElementAlias match_Staple_RateKeyword_5_1_q;
	protected AbstractElementAlias match_Staple_ToKeyword_5_0_q;
	protected AbstractElementAlias match_Staple_WhereKeyword_8_0_q;
	protected AbstractElementAlias match_Staple___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q;
	protected AbstractElementAlias match_Staple___TheKeyword_3_0_q_UserKeyword_3_1__q;
	protected AbstractElementAlias match_SumConstant_AccordingKeyword_5_2_q;
	protected AbstractElementAlias match_SumConstant_DivideKeyword_5_1_q;
	protected AbstractElementAlias match_SumConstant_ImportanceKeyword_5_5_q;
	protected AbstractElementAlias match_SumConstant_TheKeyword_5_4_q;
	protected AbstractElementAlias match_SumConstant_ToKeyword_5_0_q;
	protected AbstractElementAlias match_SumConstant_ToKeyword_5_3_q;
	protected AbstractElementAlias match_SumConstant___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q;
	protected AbstractElementAlias match_SumConstant___TheKeyword_3_0_q_UserKeyword_3_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SurveyGrammarAccess) access;
		match_Dichotomous_AnswerKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getDichotomousAccess().getAnswerKeyword_5_1());
		match_Dichotomous_ToKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getDichotomousAccess().getToKeyword_5_0());
		match_Dichotomous___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDichotomousAccess().getIsRequiredKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getDichotomousAccess().getMayKeyword_4_0()));
		match_Dichotomous___TheKeyword_3_0_q_UserKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getDichotomousAccess().getTheKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDichotomousAccess().getUserKeyword_3_1()));
		match_MultipleChoice_AnswerKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_5_1());
		match_MultipleChoice_ConditionalsKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getConditionalsKeyword_8_0());
		match_MultipleChoice_ElseKeyword_7_3_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getElseKeyword_7_3());
		match_MultipleChoice_IsRequiredKeyword_4_1_q_or_MayKeyword_4_0_q = new AlternativeAlias(false, false, new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getIsRequiredKeyword_4_1()), new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getMayKeyword_4_0()));
		match_MultipleChoice_SomethingKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_7_2());
		match_MultipleChoice_TheseKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_6_2());
		match_MultipleChoice_ToKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getToKeyword_5_0());
		match_MultipleChoice_WithKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getWithKeyword_6_0());
		match_MultipleChoice_WithKeyword_7_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getWithKeyword_7_1());
		match_MultipleChoice___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getIsRequiredKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getMayKeyword_4_0()));
		match_MultipleChoice___OneKeyword_6_1_0_or_SomeOfKeyword_6_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getOneKeyword_6_1_0()), new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getSomeOfKeyword_6_1_1()));
		match_MultipleChoice___TheKeyword_3_0_q_UserKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getTheKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getMultipleChoiceAccess().getUserKeyword_3_1()));
		match_Open_AnswerKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getAnswerKeyword_5_1());
		match_Open_ToKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getToKeyword_5_0());
		match_Open___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getOpenAccess().getIsRequiredKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getOpenAccess().getMayKeyword_4_0()));
		match_Open___TheKeyword_3_0_q_UserKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getOpenAccess().getTheKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getOpenAccess().getUserKeyword_3_1()));
		match_RankingFork_MatchKeyword_4_q = new TokenAlias(false, true, grammarAccess.getRankingForkAccess().getMatchKeyword_4());
		match_RankingFork_WithKeyword_5_q = new TokenAlias(false, true, grammarAccess.getRankingForkAccess().getWithKeyword_5());
		match_Ranking_AskKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getAskKeyword_3_0());
		match_Ranking_CanKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getCanKeyword_4_1());
		match_Ranking_ConditionalsKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getConditionalsKeyword_5_0());
		match_Ranking_FromKeyword_4_3_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getFromKeyword_4_3());
		match_Ranking_IsRequiredKeyword_2_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getIsRequiredKeyword_2());
		match_Ranking_TheseKeyword_4_4_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getTheseKeyword_4_4());
		match_Ranking_YouKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getRankingAccess().getYouKeyword_4_0());
		match_Rating_Impl_AndKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getAndKeyword_7_0());
		match_Rating_Impl_AndKeyword_9_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getAndKeyword_9_0());
		match_Rating_Impl_BetweenKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getBetweenKeyword_6_0());
		match_Rating_Impl_ConditionalsKeyword_10_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getConditionalsKeyword_10_0());
		match_Rating_Impl_HighestKeyword_9_1_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getHighestKeyword_9_1());
		match_Rating_Impl_LowestKeyword_8_1_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getLowestKeyword_8_1());
		match_Rating_Impl_MeansKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getMeansKeyword_8_2());
		match_Rating_Impl_MeansKeyword_9_2_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getMeansKeyword_9_2());
		match_Rating_Impl_RateKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getRateKeyword_5_1());
		match_Rating_Impl_ToKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getToKeyword_5_0());
		match_Rating_Impl_WhereKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getWhereKeyword_8_0());
		match_Rating_Impl___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getIsRequiredKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getMayKeyword_4_0()));
		match_Rating_Impl___TheKeyword_3_0_q_UserKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getRating_ImplAccess().getTheKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getRating_ImplAccess().getUserKeyword_3_1()));
		match_Staple_AndKeyword_10_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getAndKeyword_10_0());
		match_Staple_AndKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getAndKeyword_7_0());
		match_Staple_BetweenKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getBetweenKeyword_6_0());
		match_Staple_CommaKeyword_8_3_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getCommaKeyword_8_3());
		match_Staple_HighestKeyword_10_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getHighestKeyword_10_1());
		match_Staple_LowestKeyword_8_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getLowestKeyword_8_1());
		match_Staple_MeanKeyword_9_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeanKeyword_9_0());
		match_Staple_MeansKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_10_2());
		match_Staple_MeansKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_8_2());
		match_Staple_MeansKeyword_9_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getMeansKeyword_9_1());
		match_Staple_RateKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getRateKeyword_5_1());
		match_Staple_ToKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getToKeyword_5_0());
		match_Staple_WhereKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getStapleAccess().getWhereKeyword_8_0());
		match_Staple___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getStapleAccess().getIsRequiredKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getStapleAccess().getMayKeyword_4_0()));
		match_Staple___TheKeyword_3_0_q_UserKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getStapleAccess().getTheKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getStapleAccess().getUserKeyword_3_1()));
		match_SumConstant_AccordingKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getAccordingKeyword_5_2());
		match_SumConstant_DivideKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getDivideKeyword_5_1());
		match_SumConstant_ImportanceKeyword_5_5_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getImportanceKeyword_5_5());
		match_SumConstant_TheKeyword_5_4_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getTheKeyword_5_4());
		match_SumConstant_ToKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getToKeyword_5_0());
		match_SumConstant_ToKeyword_5_3_q = new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getToKeyword_5_3());
		match_SumConstant___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSumConstantAccess().getIsRequiredKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getSumConstantAccess().getMayKeyword_4_0()));
		match_SumConstant___TheKeyword_3_0_q_UserKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getSumConstantAccess().getTheKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSumConstantAccess().getUserKeyword_3_1()));
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
			if(match_Dichotomous_AnswerKeyword_5_1_q.equals(syntax))
				emit_Dichotomous_AnswerKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dichotomous_ToKeyword_5_0_q.equals(syntax))
				emit_Dichotomous_ToKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dichotomous___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q.equals(syntax))
				emit_Dichotomous___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dichotomous___TheKeyword_3_0_q_UserKeyword_3_1__q.equals(syntax))
				emit_Dichotomous___TheKeyword_3_0_q_UserKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_AnswerKeyword_5_1_q.equals(syntax))
				emit_MultipleChoice_AnswerKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ConditionalsKeyword_8_0_q.equals(syntax))
				emit_MultipleChoice_ConditionalsKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ElseKeyword_7_3_q.equals(syntax))
				emit_MultipleChoice_ElseKeyword_7_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_IsRequiredKeyword_4_1_q_or_MayKeyword_4_0_q.equals(syntax))
				emit_MultipleChoice_IsRequiredKeyword_4_1_q_or_MayKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_SomethingKeyword_7_2_q.equals(syntax))
				emit_MultipleChoice_SomethingKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_TheseKeyword_6_2_q.equals(syntax))
				emit_MultipleChoice_TheseKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ToKeyword_5_0_q.equals(syntax))
				emit_MultipleChoice_ToKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_WithKeyword_6_0_q.equals(syntax))
				emit_MultipleChoice_WithKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_WithKeyword_7_1_q.equals(syntax))
				emit_MultipleChoice_WithKeyword_7_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q.equals(syntax))
				emit_MultipleChoice___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice___OneKeyword_6_1_0_or_SomeOfKeyword_6_1_1__q.equals(syntax))
				emit_MultipleChoice___OneKeyword_6_1_0_or_SomeOfKeyword_6_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice___TheKeyword_3_0_q_UserKeyword_3_1__q.equals(syntax))
				emit_MultipleChoice___TheKeyword_3_0_q_UserKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_AnswerKeyword_5_1_q.equals(syntax))
				emit_Open_AnswerKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_ToKeyword_5_0_q.equals(syntax))
				emit_Open_ToKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q.equals(syntax))
				emit_Open___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open___TheKeyword_3_0_q_UserKeyword_3_1__q.equals(syntax))
				emit_Open___TheKeyword_3_0_q_UserKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RankingFork_MatchKeyword_4_q.equals(syntax))
				emit_RankingFork_MatchKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RankingFork_WithKeyword_5_q.equals(syntax))
				emit_RankingFork_WithKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_AskKeyword_3_0_q.equals(syntax))
				emit_Ranking_AskKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_CanKeyword_4_1_q.equals(syntax))
				emit_Ranking_CanKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_ConditionalsKeyword_5_0_q.equals(syntax))
				emit_Ranking_ConditionalsKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_FromKeyword_4_3_q.equals(syntax))
				emit_Ranking_FromKeyword_4_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_IsRequiredKeyword_2_q.equals(syntax))
				emit_Ranking_IsRequiredKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_TheseKeyword_4_4_q.equals(syntax))
				emit_Ranking_TheseKeyword_4_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Ranking_YouKeyword_4_0_q.equals(syntax))
				emit_Ranking_YouKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_AndKeyword_7_0_q.equals(syntax))
				emit_Rating_Impl_AndKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_AndKeyword_9_0_q.equals(syntax))
				emit_Rating_Impl_AndKeyword_9_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_BetweenKeyword_6_0_q.equals(syntax))
				emit_Rating_Impl_BetweenKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_ConditionalsKeyword_10_0_q.equals(syntax))
				emit_Rating_Impl_ConditionalsKeyword_10_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_HighestKeyword_9_1_q.equals(syntax))
				emit_Rating_Impl_HighestKeyword_9_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_LowestKeyword_8_1_q.equals(syntax))
				emit_Rating_Impl_LowestKeyword_8_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_MeansKeyword_8_2_q.equals(syntax))
				emit_Rating_Impl_MeansKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_MeansKeyword_9_2_q.equals(syntax))
				emit_Rating_Impl_MeansKeyword_9_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_RateKeyword_5_1_q.equals(syntax))
				emit_Rating_Impl_RateKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_ToKeyword_5_0_q.equals(syntax))
				emit_Rating_Impl_ToKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl_WhereKeyword_8_0_q.equals(syntax))
				emit_Rating_Impl_WhereKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q.equals(syntax))
				emit_Rating_Impl___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rating_Impl___TheKeyword_3_0_q_UserKeyword_3_1__q.equals(syntax))
				emit_Rating_Impl___TheKeyword_3_0_q_UserKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_AndKeyword_10_0_q.equals(syntax))
				emit_Staple_AndKeyword_10_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_AndKeyword_7_0_q.equals(syntax))
				emit_Staple_AndKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_BetweenKeyword_6_0_q.equals(syntax))
				emit_Staple_BetweenKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_CommaKeyword_8_3_q.equals(syntax))
				emit_Staple_CommaKeyword_8_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_HighestKeyword_10_1_q.equals(syntax))
				emit_Staple_HighestKeyword_10_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_LowestKeyword_8_1_q.equals(syntax))
				emit_Staple_LowestKeyword_8_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeanKeyword_9_0_q.equals(syntax))
				emit_Staple_MeanKeyword_9_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_10_2_q.equals(syntax))
				emit_Staple_MeansKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_8_2_q.equals(syntax))
				emit_Staple_MeansKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_MeansKeyword_9_1_q.equals(syntax))
				emit_Staple_MeansKeyword_9_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_RateKeyword_5_1_q.equals(syntax))
				emit_Staple_RateKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_ToKeyword_5_0_q.equals(syntax))
				emit_Staple_ToKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple_WhereKeyword_8_0_q.equals(syntax))
				emit_Staple_WhereKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q.equals(syntax))
				emit_Staple___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Staple___TheKeyword_3_0_q_UserKeyword_3_1__q.equals(syntax))
				emit_Staple___TheKeyword_3_0_q_UserKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_AccordingKeyword_5_2_q.equals(syntax))
				emit_SumConstant_AccordingKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_DivideKeyword_5_1_q.equals(syntax))
				emit_SumConstant_DivideKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_ImportanceKeyword_5_5_q.equals(syntax))
				emit_SumConstant_ImportanceKeyword_5_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_TheKeyword_5_4_q.equals(syntax))
				emit_SumConstant_TheKeyword_5_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_ToKeyword_5_0_q.equals(syntax))
				emit_SumConstant_ToKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant_ToKeyword_5_3_q.equals(syntax))
				emit_SumConstant_ToKeyword_5_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q.equals(syntax))
				emit_SumConstant___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SumConstant___TheKeyword_3_0_q_UserKeyword_3_1__q.equals(syntax))
				emit_SumConstant___TheKeyword_3_0_q_UserKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_Dichotomous_AnswerKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Dichotomous_ToKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is required' | 'may')?
	 */
	protected void emit_Dichotomous___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Dichotomous___TheKeyword_3_0_q_UserKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_MultipleChoice_AnswerKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conditionals'?
	 */
	protected void emit_MultipleChoice_ConditionalsKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else'?
	 */
	protected void emit_MultipleChoice_ElseKeyword_7_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is required'? | 'may'?
	 */
	protected void emit_MultipleChoice_IsRequiredKeyword_4_1_q_or_MayKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'something'?
	 */
	protected void emit_MultipleChoice_SomethingKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'these:'?
	 */
	protected void emit_MultipleChoice_TheseKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_MultipleChoice_ToKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_MultipleChoice_WithKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_MultipleChoice_WithKeyword_7_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('may' | 'is required')?
	 */
	protected void emit_MultipleChoice___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('some of' | 'one')?
	 */
	protected void emit_MultipleChoice___OneKeyword_6_1_0_or_SomeOfKeyword_6_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_MultipleChoice___TheKeyword_3_0_q_UserKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'answer'?
	 */
	protected void emit_Open_AnswerKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Open_ToKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('may' | 'is required')?
	 */
	protected void emit_Open___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Open___TheKeyword_3_0_q_UserKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'match'?
	 */
	protected void emit_RankingFork_MatchKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_RankingFork_WithKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'ask'?
	 */
	protected void emit_Ranking_AskKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'can'?
	 */
	protected void emit_Ranking_CanKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conditionals'?
	 */
	protected void emit_Ranking_ConditionalsKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'from'?
	 */
	protected void emit_Ranking_FromKeyword_4_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is required'?
	 */
	protected void emit_Ranking_IsRequiredKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'these'?
	 */
	protected void emit_Ranking_TheseKeyword_4_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'you'?
	 */
	protected void emit_Ranking_YouKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Rating_Impl_AndKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Rating_Impl_AndKeyword_9_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'between'?
	 */
	protected void emit_Rating_Impl_BetweenKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'conditionals'?
	 */
	protected void emit_Rating_Impl_ConditionalsKeyword_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'highest'?
	 */
	protected void emit_Rating_Impl_HighestKeyword_9_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'lowest'?
	 */
	protected void emit_Rating_Impl_LowestKeyword_8_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Rating_Impl_MeansKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Rating_Impl_RateKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Rating_Impl_ToKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'where'?
	 */
	protected void emit_Rating_Impl_WhereKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('is required' | 'may')?
	 */
	protected void emit_Rating_Impl___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Rating_Impl___TheKeyword_3_0_q_UserKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Staple_AndKeyword_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'and'?
	 */
	protected void emit_Staple_AndKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'between'?
	 */
	protected void emit_Staple_BetweenKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Staple_CommaKeyword_8_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'highest'?
	 */
	protected void emit_Staple_HighestKeyword_10_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'lowest'?
	 */
	protected void emit_Staple_LowestKeyword_8_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'mean'?
	 */
	protected void emit_Staple_MeanKeyword_9_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'means'?
	 */
	protected void emit_Staple_MeansKeyword_9_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rate'?
	 */
	protected void emit_Staple_RateKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_Staple_ToKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'where'?
	 */
	protected void emit_Staple_WhereKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('may' | 'is required')?
	 */
	protected void emit_Staple___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_Staple___TheKeyword_3_0_q_UserKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'according'?
	 */
	protected void emit_SumConstant_AccordingKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'divide'?
	 */
	protected void emit_SumConstant_DivideKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'importance'?
	 */
	protected void emit_SumConstant_ImportanceKeyword_5_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'the'?
	 */
	protected void emit_SumConstant_TheKeyword_5_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_SumConstant_ToKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'to'?
	 */
	protected void emit_SumConstant_ToKeyword_5_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('may' | 'is required')?
	 */
	protected void emit_SumConstant___IsRequiredKeyword_4_1_or_MayKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('The'? 'user')?
	 */
	protected void emit_SumConstant___TheKeyword_3_0_q_UserKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
