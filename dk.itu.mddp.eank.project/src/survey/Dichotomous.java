/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dichotomous</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Dichotomous#getYes <em>Yes</em>}</li>
 *   <li>{@link survey.Dichotomous#getNo <em>No</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getDichotomous()
 * @model
 * @generated
 */
public interface Dichotomous extends Question {
	/**
	 * Returns the value of the '<em><b>Yes</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yes</em>' containment reference list.
	 * @see survey.surveyPackage#getDichotomous_Yes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getYes();

	/**
	 * Returns the value of the '<em><b>No</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' containment reference list.
	 * @see survey.surveyPackage#getDichotomous_No()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getNo();

} // Dichotomous
