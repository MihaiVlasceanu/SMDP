/**
 */
package survey.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import survey.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see survey.SurveyPackage
 * @generated
 */
public class SurveySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SurveyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveySwitch() {
		if (modelPackage == null) {
			modelPackage = SurveyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SurveyPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.SURVEY: {
				Survey survey = (Survey)theEObject;
				T result = caseSurvey(survey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.MULTIPLE_CHOICE: {
				MultipleChoice multipleChoice = (MultipleChoice)theEObject;
				T result = caseMultipleChoice(multipleChoice);
				if (result == null) result = caseQuestion(multipleChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.OPEN: {
				Open open = (Open)theEObject;
				T result = caseOpen(open);
				if (result == null) result = caseQuestion(open);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.RATING: {
				Rating rating = (Rating)theEObject;
				T result = caseRating(rating);
				if (result == null) result = caseQuestion(rating);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.RANKING: {
				Ranking ranking = (Ranking)theEObject;
				T result = caseRanking(ranking);
				if (result == null) result = caseQuestion(ranking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.DICHOTOMOUS: {
				Dichotomous dichotomous = (Dichotomous)theEObject;
				T result = caseDichotomous(dichotomous);
				if (result == null) result = caseQuestion(dichotomous);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.CONSTANT_SUM: {
				ConstantSum constantSum = (ConstantSum)theEObject;
				T result = caseConstantSum(constantSum);
				if (result == null) result = caseQuestion(constantSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.STAPLE: {
				Staple staple = (Staple)theEObject;
				T result = caseStaple(staple);
				if (result == null) result = caseRating(staple);
				if (result == null) result = caseQuestion(staple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.RATING_FORK: {
				RatingFork ratingFork = (RatingFork)theEObject;
				T result = caseRatingFork(ratingFork);
				if (result == null) result = caseFork(ratingFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.CHOICE_FORK: {
				ChoiceFork choiceFork = (ChoiceFork)theEObject;
				T result = caseChoiceFork(choiceFork);
				if (result == null) result = caseFork(choiceFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.DICHOTOMOUS_FORK: {
				DichotomousFork dichotomousFork = (DichotomousFork)theEObject;
				T result = caseDichotomousFork(dichotomousFork);
				if (result == null) result = caseFork(dichotomousFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.RANKING_CHOICE_FORK: {
				RankingChoiceFork rankingChoiceFork = (RankingChoiceFork)theEObject;
				T result = caseRankingChoiceFork(rankingChoiceFork);
				if (result == null) result = caseFork(rankingChoiceFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SurveyPackage.RANKING_SUM_FORK: {
				RankingSumFork rankingSumFork = (RankingSumFork)theEObject;
				T result = caseRankingSumFork(rankingSumFork);
				if (result == null) result = caseFork(rankingSumFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Survey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurvey(Survey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoice(MultipleChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpen(Open object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rating</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRating(Rating object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRanking(Ranking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dichotomous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dichotomous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDichotomous(Dichotomous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantSum(ConstantSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaple(Staple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rating Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rating Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatingFork(RatingFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceFork(ChoiceFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dichotomous Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dichotomous Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDichotomousFork(DichotomousFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranking Choice Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranking Choice Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRankingChoiceFork(RankingChoiceFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranking Sum Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranking Sum Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRankingSumFork(RankingSumFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SurveySwitch
