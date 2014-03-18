/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.MultipleChoiceFork#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link survey.MultipleChoiceFork#getForkedquestions <em>Forkedquestions</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getMultipleChoiceFork()
 * @model
 * @generated
 */
public interface MultipleChoiceFork extends EObject {
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
	 * @see survey.surveyPackage#getMultipleChoiceFork_Matcher()
	 * @model required="true"
	 * @generated
	 */
	Choice getMatcher();

	/**
	 * Sets the value of the '{@link survey.MultipleChoiceFork#getMatcher <em>Matcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matcher</em>' reference.
	 * @see #getMatcher()
	 * @generated
	 */
	void setMatcher(Choice value);

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
	 * @see survey.surveyPackage#getMultipleChoiceFork_Forkedquestions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getForkedquestions();

} // MultipleChoiceFork
