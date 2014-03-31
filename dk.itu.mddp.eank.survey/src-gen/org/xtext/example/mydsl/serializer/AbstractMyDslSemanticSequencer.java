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
import survey.Dichotomous;
import survey.DichotomousFork;
import survey.Model;
import survey.MultipleChoice;
import survey.Open;
import survey.Ranking;
import survey.RankingSumFork;
import survey.Rating;
import survey.RatingFork;
import survey.Staple;
import survey.SumConstant;
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
			case SurveyPackage.DICHOTOMOUS:
				if(context == grammarAccess.getDichotomousRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Dichotomous(context, (Dichotomous) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.DICHOTOMOUS_FORK:
				if(context == grammarAccess.getDichotomousForkRule()) {
					sequence_DichotomousFork(context, (DichotomousFork) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
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
			case SurveyPackage.SUM_CONSTANT:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getSumConstantRule()) {
					sequence_SumConstant(context, (SumConstant) semanticObject); 
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
	 *     (On+=[Choice|EString] On+=[Choice|EString]* Questions+=[Question|EString] Questions+=[Question|EString]*)
	 */
	protected void sequence_ChoiceFork(EObject context, ChoiceFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Description=EString)
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
	 *     (Questions+=[Question|EString] Questions+=[Question|EString]*)
	 */
	protected void sequence_DichotomousFork(EObject context, DichotomousFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID isRequired?='is required'? question=EString? onYes=DichotomousFork? onNo=DichotomousFork?)
	 */
	protected void sequence_Dichotomous(EObject context, Dichotomous semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((surveys+=Survey surveys+=Survey*)?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is required'? 
	 *         question=EString? 
	 *         answerCount=EInt? 
	 *         (choice+=Choice choice+=Choice*)? 
	 *         other=EString? 
	 *         (Fork+=ChoiceFork Fork+=ChoiceFork*)?
	 *     )
	 */
	protected void sequence_MultipleChoice(EObject context, MultipleChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID question=EString?)
	 */
	protected void sequence_Open(EObject context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         On+=[Choice|EString] 
	 *         On+=[Choice|EString]* 
	 *         Min=EInt 
	 *         Max=EInt 
	 *         Questions+=[Question|EString] 
	 *         Questions+=[Question|EString]*
	 *     )
	 */
	protected void sequence_RankingSumFork(EObject context, RankingSumFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID isRequired?='is required'? question=EString? (choices+=Choice choices+=Choice*)? (Fork+=RankingSumFork Fork+=RankingSumFork*)?)
	 */
	protected void sequence_Ranking(EObject context, Ranking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Min=EInt Max=EInt Questions+=[Question|EString] Questions+=[Question|EString]*)
	 */
	protected void sequence_RatingFork(EObject context, RatingFork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         question=EString? 
	 *         Min=EInt? 
	 *         Max=EInt? 
	 *         first=EString? 
	 *         last=EString? 
	 *         (Fork+=RatingFork Fork+=RatingFork*)?
	 *     )
	 */
	protected void sequence_Rating_Impl(EObject context, Rating semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is required'? 
	 *         question=EString? 
	 *         Min=EInt? 
	 *         Max=EInt? 
	 *         first=EString? 
	 *         mid=EString? 
	 *         last=EString? 
	 *         (Fork+=RatingFork Fork+=RatingFork*)?
	 *     )
	 */
	protected void sequence_Staple(EObject context, Staple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isRequired?='is required'? 
	 *         question=EString? 
	 *         Constant=EInt 
	 *         (Choices+=Choice Choices+=Choice*)? 
	 *         (Fork+=RankingSumFork Fork+=RankingSumFork*)?
	 *     )
	 */
	protected void sequence_SumConstant(EObject context, SumConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (questions+=Question questions+=Question*)?)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
