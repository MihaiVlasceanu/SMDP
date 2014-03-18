/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.RankingFork#getForkedquestions <em>Forkedquestions</em>}</li>
 *   <li>{@link survey.RankingFork#getMin <em>Min</em>}</li>
 *   <li>{@link survey.RankingFork#getMax <em>Max</em>}</li>
 *   <li>{@link survey.RankingFork#getMatcher <em>Matcher</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getRankingFork()
 * @model
 * @generated
 */
public interface RankingFork extends EObject {
	/**
	 * Returns the value of the '<em><b>Forkedquestions</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forkedquestions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forkedquestions</em>' containment reference list.
	 * @see survey.surveyPackage#getRankingFork_Forkedquestions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getForkedquestions();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see survey.surveyPackage#getRankingFork_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link survey.RankingFork#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see survey.surveyPackage#getRankingFork_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link survey.RankingFork#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Matcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matcher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matcher</em>' reference.
	 * @see #setMatcher(Choice)
	 * @see survey.surveyPackage#getRankingFork_Matcher()
	 * @model required="true"
	 * @generated
	 */
	Choice getMatcher();

	/**
	 * Sets the value of the '{@link survey.RankingFork#getMatcher <em>Matcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matcher</em>' reference.
	 * @see #getMatcher()
	 * @generated
	 */
	void setMatcher(Choice value);

} // RankingFork
