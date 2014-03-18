package dk.itu.mddp.eank.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.mddp.eank.survey.services.SurveyGrammarAccess;
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
import survey.Choice;
import survey.Dichotomous;
import survey.Model;
import survey.MultipleChoice;
import survey.MultipleChoiceFork;
import survey.Open;
import survey.Ranking;
import survey.RankingFork;
import survey.Rating;
import survey.RatingFork;
import survey.Staple;
import survey.SumConstant;
import survey.Survey;
import survey.surveyPackage;

@SuppressWarnings("all")
public abstract class AbstractSurveySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SurveyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == surveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case surveyPackage.CHOICE:
				if(context == grammarAccess.getChoiceRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.DICHOTOMOUS:
				if(context == grammarAccess.getDichotomousRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Dichotomous(context, (Dichotomous) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.MULTIPLE_CHOICE:
				if(context == grammarAccess.getMultipleChoiceRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MultipleChoice(context, (MultipleChoice) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.MULTIPLE_CHOICE_FORK:
				if(context == grammarAccess.getMultipleChoiceForkRule()) {
					sequence_MultipleChoiceFork(context, (MultipleChoiceFork) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.OPEN:
				if(context == grammarAccess.getOpenRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Open(context, (Open) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.RANKING:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getRankingRule()) {
					sequence_Ranking(context, (Ranking) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.RANKING_FORK:
				if(context == grammarAccess.getRankingForkRule()) {
					sequence_RankingFork(context, (RankingFork) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.RATING:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getRating_ImplRule()) {
					sequence_Rating_Impl(context, (Rating) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.RATING_FORK:
				if(context == grammarAccess.getRatingForkRule()) {
					sequence_RatingFork(context, (RatingFork) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.STAPLE:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getStapleRule()) {
					sequence_Staple(context, (Staple) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.SUM_CONSTANT:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getSumConstantRule()) {
					sequence_SumConstant(context, (SumConstant) semanticObject); 
					return; 
				}
				else break;
			case surveyPackage.SURVEY:
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
	 *     (name=ID Description=EString)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, surveyPackage.Literals.CHOICE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, surveyPackage.Literals.CHOICE__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, surveyPackage.Literals.CHOICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, surveyPackage.Literals.CHOICE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (question=EString? (yes+=Question yes+=Question*)? (no+=Question no+=Question*)?)
	 */
	protected void sequence_Dichotomous(EObject context, Dichotomous semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (surveys+=Survey?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (matcher=[Choice|ID] (forkedquestions+=Question forkedquestions+=Question*)?)
	 */
	protected void sequence_MultipleChoiceFork(EObject context, MultipleChoiceFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         question=EString? 
	 *         (choice+=Choice choice+=Choice*)? 
	 *         other=EString? 
	 *         (MultipleChoiceForks+=MultipleChoiceFork MultipleChoiceForks+=MultipleChoiceFork*)?
	 *     )
	 */
	protected void sequence_MultipleChoice(EObject context, MultipleChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question=EString?)
	 */
	protected void sequence_Open(EObject context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=EInt? max=EInt? matcher=[Choice|ID] (forkedquestions+=Question forkedquestions+=Question*)?)
	 */
	protected void sequence_RankingFork(EObject context, RankingFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question=EString? (choices+=Choice choices+=Choice*)? (forks+=RankingFork forks+=RankingFork*)?)
	 */
	protected void sequence_Ranking(EObject context, Ranking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=EInt? max=EInt? (forkedquestion+=Question forkedquestion+=Question*)?)
	 */
	protected void sequence_RatingFork(EObject context, RatingFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         question=EString? 
	 *         Min=EInt? 
	 *         Max=EInt? 
	 *         first=EString? 
	 *         last=EString? 
	 *         (RatingForks+=RatingFork RatingForks+=RatingFork*)?
	 *     )
	 */
	protected void sequence_Rating_Impl(EObject context, Rating semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         question=EString? 
	 *         Min=EInt? 
	 *         Max=EInt? 
	 *         first=EString? 
	 *         mid=EString? 
	 *         last=EString? 
	 *         (RatingForks+=RatingFork RatingForks+=RatingFork*)?
	 *     )
	 */
	protected void sequence_Staple(EObject context, Staple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question=EString?)
	 */
	protected void sequence_SumConstant(EObject context, SumConstant semanticObject) {
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
