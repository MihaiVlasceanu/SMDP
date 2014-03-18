/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Open#getAnswerLength <em>Answer Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getOpen()
 * @model
 * @generated
 */
public interface Open extends Question {
	/**
	 * Returns the value of the '<em><b>Answer Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Length</em>' attribute.
	 * @see #setAnswerLength(String)
	 * @see survey.surveyPackage#getOpen_AnswerLength()
	 * @model
	 * @generated
	 */
	String getAnswerLength();

	/**
	 * Sets the value of the '{@link survey.Open#getAnswerLength <em>Answer Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Length</em>' attribute.
	 * @see #getAnswerLength()
	 * @generated
	 */
	void setAnswerLength(String value);

} // Open
