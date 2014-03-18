/**
 */
package survey.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import survey.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class surveyFactoryImpl extends EFactoryImpl implements surveyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static surveyFactory init() {
		try {
			surveyFactory thesurveyFactory = (surveyFactory)EPackage.Registry.INSTANCE.getEFactory(surveyPackage.eNS_URI);
			if (thesurveyFactory != null) {
				return thesurveyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new surveyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public surveyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case surveyPackage.MODEL: return createModel();
			case surveyPackage.SURVEY: return createSurvey();
			case surveyPackage.MULTIPLE_CHOICE: return createMultipleChoice();
			case surveyPackage.OPEN: return createOpen();
			case surveyPackage.RATING: return createRating();
			case surveyPackage.CHOICE: return createChoice();
			case surveyPackage.RANKING: return createRanking();
			case surveyPackage.DICHOTOMOUS: return createDichotomous();
			case surveyPackage.SUM_CONSTANT: return createSumConstant();
			case surveyPackage.STAPLE: return createStaple();
			case surveyPackage.RANKING_FORK: return createRankingFork();
			case surveyPackage.MULTIPLE_CHOICE_FORK: return createMultipleChoiceFork();
			case surveyPackage.RATING_FORK: return createRatingFork();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open createOpen() {
		OpenImpl open = new OpenImpl();
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rating createRating() {
		RatingImpl rating = new RatingImpl();
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ranking createRanking() {
		RankingImpl ranking = new RankingImpl();
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dichotomous createDichotomous() {
		DichotomousImpl dichotomous = new DichotomousImpl();
		return dichotomous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SumConstant createSumConstant() {
		SumConstantImpl sumConstant = new SumConstantImpl();
		return sumConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staple createStaple() {
		StapleImpl staple = new StapleImpl();
		return staple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingFork createRankingFork() {
		RankingForkImpl rankingFork = new RankingForkImpl();
		return rankingFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceFork createMultipleChoiceFork() {
		MultipleChoiceForkImpl multipleChoiceFork = new MultipleChoiceForkImpl();
		return multipleChoiceFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatingFork createRatingFork() {
		RatingForkImpl ratingFork = new RatingForkImpl();
		return ratingFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public surveyPackage getsurveyPackage() {
		return (surveyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static surveyPackage getPackage() {
		return surveyPackage.eINSTANCE;
	}

} //surveyFactoryImpl
