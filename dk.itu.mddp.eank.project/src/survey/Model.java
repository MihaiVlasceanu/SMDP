/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Model#getSurveys <em>Surveys</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Surveys</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Survey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surveys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surveys</em>' containment reference list.
	 * @see survey.surveyPackage#getModel_Surveys()
	 * @model containment="true"
	 * @generated
	 */
	EList<Survey> getSurveys();

} // Model
