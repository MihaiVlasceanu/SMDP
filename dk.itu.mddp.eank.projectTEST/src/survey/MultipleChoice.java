/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.MultipleChoice#getChoice <em>Choice</em>}</li>
 *   <li>{@link survey.MultipleChoice#getOther <em>Other</em>}</li>
 *   <li>{@link survey.MultipleChoice#getForks <em>Forks</em>}</li>
 *   <li>{@link survey.MultipleChoice#getAnswerCount <em>Answer Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends Question {
	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see survey.SurveyPackage#getMultipleChoice_Choice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choice> getChoice();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(String)
	 * @see survey.SurveyPackage#getMultipleChoice_Other()
	 * @model
	 * @generated
	 */
	String getOther();

	/**
	 * Sets the value of the '{@link survey.MultipleChoice#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(String value);

	/**
	 * Returns the value of the '<em><b>Forks</b></em>' containment reference list.
	 * The list contents are of type {@link survey.ChoiceFork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' containment reference list.
	 * @see survey.SurveyPackage#getMultipleChoice_Forks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChoiceFork> getForks();

	/**
	 * Returns the value of the '<em><b>Answer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Count</em>' attribute.
	 * @see #setAnswerCount(int)
	 * @see survey.SurveyPackage#getMultipleChoice_AnswerCount()
	 * @model
	 * @generated
	 */
	int getAnswerCount();

	/**
	 * Sets the value of the '{@link survey.MultipleChoice#getAnswerCount <em>Answer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Count</em>' attribute.
	 * @see #getAnswerCount()
	 * @generated
	 */
	void setAnswerCount(int value);

} // MultipleChoice
