/**
 */
package survey;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Model#getSurvey <em>Survey</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Survey</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey</em>' containment reference.
	 * @see #setSurvey(Survey)
	 * @see survey.SurveyPackage#getModel_Survey()
	 * @model containment="true"
	 * @generated
	 */
	Survey getSurvey();

	/**
	 * Sets the value of the '{@link survey.Model#getSurvey <em>Survey</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey</em>' containment reference.
	 * @see #getSurvey()
	 * @generated
	 */
	void setSurvey(Survey value);

} // Model
