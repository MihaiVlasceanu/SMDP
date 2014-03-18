/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Ranking#getForks <em>Forks</em>}</li>
 *   <li>{@link survey.Ranking#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getRanking()
 * @model
 * @generated
 */
public interface Ranking extends Question {
	/**
	 * Returns the value of the '<em><b>Forks</b></em>' containment reference list.
	 * The list contents are of type {@link survey.RankingFork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' containment reference list.
	 * @see survey.surveyPackage#getRanking_Forks()
	 * @model containment="true"
	 * @generated
	 */
	EList<RankingFork> getForks();

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see survey.surveyPackage#getRanking_Choices()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Choice> getChoices();

} // Ranking
