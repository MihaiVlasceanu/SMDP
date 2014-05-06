package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import survey.Choice;
import survey.ChoiceFork;
import survey.ConstantSum;
import survey.MultipleChoice;
import survey.Open;
import survey.Ranking;
import survey.RankingSumFork;
import survey.Rating;
import survey.RatingFork;
import survey.Staple;
import survey.Survey;
import survey.SurveyPackage;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveyPackage.CHOICE:
				if(context == grammarAccess.getChoiceRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.CHOICE_FORK:
				if(context == grammarAccess.getChoiceForkRule()) {
					sequence_ChoiceFork(context, (ChoiceFork) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.CONSTANT_SUM:
				if(context == grammarAccess.getConstantSumRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_ConstantSum(context, (ConstantSum) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MULTIPLE_CHOICE:
				if(context == grammarAccess.getMultipleChoiceRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MultipleChoice(context, (MultipleChoice) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.OPEN:
				if(context == grammarAccess.getOpenRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Open(context, (Open) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.RANKING:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getRankingRule()) {
					sequence_Ranking(context, (Ranking) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.RANKING_SUM_FORK:
				if(context == grammarAccess.getRankingSumForkRule()) {
					sequence_RankingSumFork(context, (RankingSumFork) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.RATING:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getRating_ImplRule()) {
					sequence_Rating_Impl(context, (Rating) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.RATING_FORK:
				if(context == grammarAccess.getRatingForkRule()) {
					sequence_RatingFork(context, (RatingFork) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.STAPLE:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getStapleRule()) {
					sequence_Staple(context, (Staple) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (on+=[Choice|EString] on+=[Choice|EString]* questions+=[Question|EString] questions+=[Question|EString]*)
	 */
	protected void sequence_ChoiceFork(EObject context, ChoiceFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=EString)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.CHOICE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.CHOICE__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.CHOICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.CHOICE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is'? 
	 *         question=EString 
	 *         constant=EInt? 
	 *         choices+=Choice 
	 *         choices+=Choice* 
	 *         (forks+=RankingSumFork forks+=RankingSumFork*)?
	 *     )
	 */
	protected void sequence_ConstantSum(EObject context, ConstantSum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is'? 
	 *         question=EString 
	 *         answerCount=EInt? 
	 *         choice+=Choice 
	 *         choice+=Choice* 
	 *         other=EString? 
	 *         (forks+=ChoiceFork forks+=ChoiceFork*)?
	 *     )
	 */
	protected void sequence_MultipleChoice(EObject context, MultipleChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID isRequired?='is'? question=EString)
	 */
	protected void sequence_Open(EObject context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         on+=[Choice|EString] 
	 *         on+=[Choice|EString]* 
	 *         min=EInt 
	 *         max=EInt 
	 *         questions+=[Question|EString] 
	 *         questions+=[Question|EString]*
	 *     )
	 */
	protected void sequence_RankingSumFork(EObject context, RankingSumFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is'? 
	 *         question=EString 
	 *         choices+=Choice 
	 *         choices+=Choice* 
	 *         (forks+=RankingSumFork forks+=RankingSumFork*)?
	 *     )
	 */
	protected void sequence_Ranking(EObject context, Ranking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=EInt max=EInt questions+=[Question|EString] questions+=[Question|EString]*)
	 */
	protected void sequence_RatingFork(EObject context, RatingFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is'? 
	 *         question=EString 
	 *         min=EInt 
	 *         max=EInt 
	 *         first=EString 
	 *         last=EString 
	 *         (forks+=RatingFork forks+=RatingFork*)?
	 *     )
	 */
	protected void sequence_Rating_Impl(EObject context, Rating semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is'? 
	 *         question=EString 
	 *         first=EString 
	 *         mid=EString 
	 *         last=EString 
	 *         (forks+=RatingFork forks+=RatingFork*)?
	 *     )
	 */
	protected void sequence_Staple(EObject context, Staple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (questions+=Question questions+=Question*)?)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
