/**
 */
package survey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see survey.surveyFactory
 * @model kind="package"
 * @generated
 */
public interface surveyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "survey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/dk.itu.mddp.eank.project/model/SurveyModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "surveyModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	surveyPackage eINSTANCE = survey.impl.surveyPackageImpl.init();

	/**
	 * The meta object id for the '{@link survey.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ModelImpl
	 * @see survey.impl.surveyPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Surveys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SURVEYS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SurveyImpl
	 * @see survey.impl.surveyPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__QUESTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.QuestionImpl
	 * @see survey.impl.surveyPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REQUIRED = 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.MultipleChoiceImpl
	 * @see survey.impl.surveyPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__CHOICE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple Choice Forks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__OTHER = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.OpenImpl
	 * @see survey.impl.surveyPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 4;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Answer Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__ANSWER_LENGTH = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RatingImpl <em>Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RatingImpl
	 * @see survey.impl.surveyPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 5;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MIN = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MAX = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__FIRST = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__LAST = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rating Forks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__RATING_FORKS = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ChoiceImpl
	 * @see survey.impl.surveyPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RankingImpl
	 * @see survey.impl.surveyPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 7;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Forks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__FORKS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__CHOICES = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.DichotomousImpl <em>Dichotomous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.DichotomousImpl
	 * @see survey.impl.surveyPackageImpl#getDichotomous()
	 * @generated
	 */
	int DICHOTOMOUS = 8;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Yes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__YES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__NO = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dichotomous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dichotomous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.SumConstantImpl <em>Sum Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SumConstantImpl
	 * @see survey.impl.surveyPackageImpl#getSumConstant()
	 * @generated
	 */
	int SUM_CONSTANT = 9;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The number of structural features of the '<em>Sum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.StapleImpl <em>Staple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.StapleImpl
	 * @see survey.impl.surveyPackageImpl#getStaple()
	 * @generated
	 */
	int STAPLE = 10;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__QUESTION = RATING__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__REQUIRED = RATING__REQUIRED;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MIN = RATING__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MAX = RATING__MAX;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__FIRST = RATING__FIRST;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__LAST = RATING__LAST;

	/**
	 * The feature id for the '<em><b>Rating Forks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__RATING_FORKS = RATING__RATING_FORKS;

	/**
	 * The feature id for the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MID = RATING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Staple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE_FEATURE_COUNT = RATING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Staple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE_OPERATION_COUNT = RATING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RankingForkImpl <em>Ranking Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RankingForkImpl
	 * @see survey.impl.surveyPackageImpl#getRankingFork()
	 * @generated
	 */
	int RANKING_FORK = 11;

	/**
	 * The feature id for the '<em><b>Forkedquestions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__FORKEDQUESTIONS = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__MAX = 2;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__MATCHER = 3;

	/**
	 * The number of structural features of the '<em>Ranking Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ranking Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.MultipleChoiceForkImpl <em>Multiple Choice Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.MultipleChoiceForkImpl
	 * @see survey.impl.surveyPackageImpl#getMultipleChoiceFork()
	 * @generated
	 */
	int MULTIPLE_CHOICE_FORK = 12;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FORK__MATCHER = 0;

	/**
	 * The feature id for the '<em><b>Forkedquestions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS = 1;

	/**
	 * The number of structural features of the '<em>Multiple Choice Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multiple Choice Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.RatingForkImpl <em>Rating Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RatingForkImpl
	 * @see survey.impl.surveyPackageImpl#getRatingFork()
	 * @generated
	 */
	int RATING_FORK = 13;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__MAX = 1;

	/**
	 * The feature id for the '<em><b>Forkedquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__FORKEDQUESTION = 2;

	/**
	 * The number of structural features of the '<em>Rating Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rating Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link survey.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see survey.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Model#getSurveys <em>Surveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surveys</em>'.
	 * @see survey.Model#getSurveys()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Surveys();

	/**
	 * Returns the meta object for class '{@link survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see survey.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Survey#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see survey.Survey#getQuestions()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Questions();

	/**
	 * Returns the meta object for the attribute '{@link survey.Survey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.Survey#getName()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Name();

	/**
	 * Returns the meta object for class '{@link survey.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see survey.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see survey.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see survey.Question#isRequired()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Required();

	/**
	 * Returns the meta object for class '{@link survey.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see survey.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoice#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see survey.MultipleChoice#getChoice()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoice#getMultipleChoiceForks <em>Multiple Choice Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiple Choice Forks</em>'.
	 * @see survey.MultipleChoice#getMultipleChoiceForks()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_MultipleChoiceForks();

	/**
	 * Returns the meta object for the attribute '{@link survey.MultipleChoice#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see survey.MultipleChoice#getOther()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Other();

	/**
	 * Returns the meta object for class '{@link survey.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open</em>'.
	 * @see survey.Open
	 * @generated
	 */
	EClass getOpen();

	/**
	 * Returns the meta object for the attribute '{@link survey.Open#getAnswerLength <em>Answer Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Length</em>'.
	 * @see survey.Open#getAnswerLength()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_AnswerLength();

	/**
	 * Returns the meta object for class '{@link survey.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating</em>'.
	 * @see survey.Rating
	 * @generated
	 */
	EClass getRating();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.Rating#getMin()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.Rating#getMax()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Max();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First</em>'.
	 * @see survey.Rating#getFirst()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_First();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last</em>'.
	 * @see survey.Rating#getLast()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Last();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Rating#getRatingForks <em>Rating Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rating Forks</em>'.
	 * @see survey.Rating#getRatingForks()
	 * @see #getRating()
	 * @generated
	 */
	EReference getRating_RatingForks();

	/**
	 * Returns the meta object for class '{@link survey.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see survey.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link survey.Choice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see survey.Choice#getDescription()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Description();

	/**
	 * Returns the meta object for the attribute '{@link survey.Choice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.Choice#getName()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Name();

	/**
	 * Returns the meta object for class '{@link survey.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see survey.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Ranking#getForks <em>Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forks</em>'.
	 * @see survey.Ranking#getForks()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Forks();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Ranking#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see survey.Ranking#getChoices()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Choices();

	/**
	 * Returns the meta object for class '{@link survey.Dichotomous <em>Dichotomous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dichotomous</em>'.
	 * @see survey.Dichotomous
	 * @generated
	 */
	EClass getDichotomous();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Dichotomous#getYes <em>Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Yes</em>'.
	 * @see survey.Dichotomous#getYes()
	 * @see #getDichotomous()
	 * @generated
	 */
	EReference getDichotomous_Yes();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Dichotomous#getNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>No</em>'.
	 * @see survey.Dichotomous#getNo()
	 * @see #getDichotomous()
	 * @generated
	 */
	EReference getDichotomous_No();

	/**
	 * Returns the meta object for class '{@link survey.SumConstant <em>Sum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Constant</em>'.
	 * @see survey.SumConstant
	 * @generated
	 */
	EClass getSumConstant();

	/**
	 * Returns the meta object for class '{@link survey.Staple <em>Staple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staple</em>'.
	 * @see survey.Staple
	 * @generated
	 */
	EClass getStaple();

	/**
	 * Returns the meta object for the attribute '{@link survey.Staple#getMid <em>Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid</em>'.
	 * @see survey.Staple#getMid()
	 * @see #getStaple()
	 * @generated
	 */
	EAttribute getStaple_Mid();

	/**
	 * Returns the meta object for class '{@link survey.RankingFork <em>Ranking Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Fork</em>'.
	 * @see survey.RankingFork
	 * @generated
	 */
	EClass getRankingFork();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.RankingFork#getForkedquestions <em>Forkedquestions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forkedquestions</em>'.
	 * @see survey.RankingFork#getForkedquestions()
	 * @see #getRankingFork()
	 * @generated
	 */
	EReference getRankingFork_Forkedquestions();

	/**
	 * Returns the meta object for the attribute '{@link survey.RankingFork#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.RankingFork#getMin()
	 * @see #getRankingFork()
	 * @generated
	 */
	EAttribute getRankingFork_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.RankingFork#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.RankingFork#getMax()
	 * @see #getRankingFork()
	 * @generated
	 */
	EAttribute getRankingFork_Max();

	/**
	 * Returns the meta object for the reference '{@link survey.RankingFork#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matcher</em>'.
	 * @see survey.RankingFork#getMatcher()
	 * @see #getRankingFork()
	 * @generated
	 */
	EReference getRankingFork_Matcher();

	/**
	 * Returns the meta object for class '{@link survey.MultipleChoiceFork <em>Multiple Choice Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice Fork</em>'.
	 * @see survey.MultipleChoiceFork
	 * @generated
	 */
	EClass getMultipleChoiceFork();

	/**
	 * Returns the meta object for the reference '{@link survey.MultipleChoiceFork#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matcher</em>'.
	 * @see survey.MultipleChoiceFork#getMatcher()
	 * @see #getMultipleChoiceFork()
	 * @generated
	 */
	EReference getMultipleChoiceFork_Matcher();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoiceFork#getForkedquestions <em>Forkedquestions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forkedquestions</em>'.
	 * @see survey.MultipleChoiceFork#getForkedquestions()
	 * @see #getMultipleChoiceFork()
	 * @generated
	 */
	EReference getMultipleChoiceFork_Forkedquestions();

	/**
	 * Returns the meta object for class '{@link survey.RatingFork <em>Rating Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating Fork</em>'.
	 * @see survey.RatingFork
	 * @generated
	 */
	EClass getRatingFork();

	/**
	 * Returns the meta object for the attribute '{@link survey.RatingFork#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.RatingFork#getMin()
	 * @see #getRatingFork()
	 * @generated
	 */
	EAttribute getRatingFork_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.RatingFork#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.RatingFork#getMax()
	 * @see #getRatingFork()
	 * @generated
	 */
	EAttribute getRatingFork_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.RatingFork#getForkedquestion <em>Forkedquestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forkedquestion</em>'.
	 * @see survey.RatingFork#getForkedquestion()
	 * @see #getRatingFork()
	 * @generated
	 */
	EReference getRatingFork_Forkedquestion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	surveyFactory getsurveyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link survey.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ModelImpl
		 * @see survey.impl.surveyPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Surveys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SURVEYS = eINSTANCE.getModel_Surveys();

		/**
		 * The meta object literal for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SurveyImpl
		 * @see survey.impl.surveyPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__QUESTIONS = eINSTANCE.getSurvey_Questions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__NAME = eINSTANCE.getSurvey_Name();

		/**
		 * The meta object literal for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.QuestionImpl
		 * @see survey.impl.surveyPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REQUIRED = eINSTANCE.getQuestion_Required();

		/**
		 * The meta object literal for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.MultipleChoiceImpl
		 * @see survey.impl.surveyPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__CHOICE = eINSTANCE.getMultipleChoice_Choice();

		/**
		 * The meta object literal for the '<em><b>Multiple Choice Forks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS = eINSTANCE.getMultipleChoice_MultipleChoiceForks();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__OTHER = eINSTANCE.getMultipleChoice_Other();

		/**
		 * The meta object literal for the '{@link survey.impl.OpenImpl <em>Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.OpenImpl
		 * @see survey.impl.surveyPackageImpl#getOpen()
		 * @generated
		 */
		EClass OPEN = eINSTANCE.getOpen();

		/**
		 * The meta object literal for the '<em><b>Answer Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__ANSWER_LENGTH = eINSTANCE.getOpen_AnswerLength();

		/**
		 * The meta object literal for the '{@link survey.impl.RatingImpl <em>Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RatingImpl
		 * @see survey.impl.surveyPackageImpl#getRating()
		 * @generated
		 */
		EClass RATING = eINSTANCE.getRating();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__MIN = eINSTANCE.getRating_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__MAX = eINSTANCE.getRating_Max();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__FIRST = eINSTANCE.getRating_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__LAST = eINSTANCE.getRating_Last();

		/**
		 * The meta object literal for the '<em><b>Rating Forks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATING__RATING_FORKS = eINSTANCE.getRating_RatingForks();

		/**
		 * The meta object literal for the '{@link survey.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ChoiceImpl
		 * @see survey.impl.surveyPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DESCRIPTION = eINSTANCE.getChoice_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__NAME = eINSTANCE.getChoice_Name();

		/**
		 * The meta object literal for the '{@link survey.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RankingImpl
		 * @see survey.impl.surveyPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '<em><b>Forks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__FORKS = eINSTANCE.getRanking_Forks();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__CHOICES = eINSTANCE.getRanking_Choices();

		/**
		 * The meta object literal for the '{@link survey.impl.DichotomousImpl <em>Dichotomous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.DichotomousImpl
		 * @see survey.impl.surveyPackageImpl#getDichotomous()
		 * @generated
		 */
		EClass DICHOTOMOUS = eINSTANCE.getDichotomous();

		/**
		 * The meta object literal for the '<em><b>Yes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICHOTOMOUS__YES = eINSTANCE.getDichotomous_Yes();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICHOTOMOUS__NO = eINSTANCE.getDichotomous_No();

		/**
		 * The meta object literal for the '{@link survey.impl.SumConstantImpl <em>Sum Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SumConstantImpl
		 * @see survey.impl.surveyPackageImpl#getSumConstant()
		 * @generated
		 */
		EClass SUM_CONSTANT = eINSTANCE.getSumConstant();

		/**
		 * The meta object literal for the '{@link survey.impl.StapleImpl <em>Staple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.StapleImpl
		 * @see survey.impl.surveyPackageImpl#getStaple()
		 * @generated
		 */
		EClass STAPLE = eINSTANCE.getStaple();

		/**
		 * The meta object literal for the '<em><b>Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAPLE__MID = eINSTANCE.getStaple_Mid();

		/**
		 * The meta object literal for the '{@link survey.impl.RankingForkImpl <em>Ranking Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RankingForkImpl
		 * @see survey.impl.surveyPackageImpl#getRankingFork()
		 * @generated
		 */
		EClass RANKING_FORK = eINSTANCE.getRankingFork();

		/**
		 * The meta object literal for the '<em><b>Forkedquestions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_FORK__FORKEDQUESTIONS = eINSTANCE.getRankingFork_Forkedquestions();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_FORK__MIN = eINSTANCE.getRankingFork_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_FORK__MAX = eINSTANCE.getRankingFork_Max();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_FORK__MATCHER = eINSTANCE.getRankingFork_Matcher();

		/**
		 * The meta object literal for the '{@link survey.impl.MultipleChoiceForkImpl <em>Multiple Choice Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.MultipleChoiceForkImpl
		 * @see survey.impl.surveyPackageImpl#getMultipleChoiceFork()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE_FORK = eINSTANCE.getMultipleChoiceFork();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE_FORK__MATCHER = eINSTANCE.getMultipleChoiceFork_Matcher();

		/**
		 * The meta object literal for the '<em><b>Forkedquestions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS = eINSTANCE.getMultipleChoiceFork_Forkedquestions();

		/**
		 * The meta object literal for the '{@link survey.impl.RatingForkImpl <em>Rating Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RatingForkImpl
		 * @see survey.impl.surveyPackageImpl#getRatingFork()
		 * @generated
		 */
		EClass RATING_FORK = eINSTANCE.getRatingFork();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_FORK__MIN = eINSTANCE.getRatingFork_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_FORK__MAX = eINSTANCE.getRatingFork_Max();

		/**
		 * The meta object literal for the '<em><b>Forkedquestion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATING_FORK__FORKEDQUESTION = eINSTANCE.getRatingFork_Forkedquestion();

	}

} //surveyPackage
