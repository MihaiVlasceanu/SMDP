/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.ConstantSum#getChoices <em>Choices</em>}</li>
 *   <li>{@link survey.ConstantSum#getConstant <em>Constant</em>}</li>
 *   <li>{@link survey.ConstantSum#getForks <em>Forks</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getConstantSum()
 * @model
 * @generated
 */
public interface ConstantSum extends Question {
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
	 * @see survey.SurveyPackage#getConstantSum_Choices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Choice> getChoices();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(int)
	 * @see survey.SurveyPackage#getConstantSum_Constant()
	 * @model
	 * @generated
	 */
	int getConstant();

	/**
	 * Sets the value of the '{@link survey.ConstantSum#getConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(int value);

	/**
	 * Returns the value of the '<em><b>Forks</b></em>' containment reference list.
	 * The list contents are of type {@link survey.RankingSumFork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' containment reference list.
	 * @see survey.SurveyPackage#getConstantSum_Forks()
	 * @model containment="true"
	 * @generated
	 */
	EList<RankingSumFork> getForks();

} // ConstantSum
