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
 *   <li>{@link survey.MultipleChoice#getMultipleChoiceForks <em>Multiple Choice Forks</em>}</li>
 *   <li>{@link survey.MultipleChoice#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getMultipleChoice()
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
	 * @see survey.surveyPackage#getMultipleChoice_Choice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choice> getChoice();

	/**
	 * Returns the value of the '<em><b>Multiple Choice Forks</b></em>' containment reference list.
	 * The list contents are of type {@link survey.MultipleChoiceFork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Choice Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Choice Forks</em>' containment reference list.
	 * @see survey.surveyPackage#getMultipleChoice_MultipleChoiceForks()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultipleChoiceFork> getMultipleChoiceForks();

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
	 * @see survey.surveyPackage#getMultipleChoice_Other()
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

} // MultipleChoice
