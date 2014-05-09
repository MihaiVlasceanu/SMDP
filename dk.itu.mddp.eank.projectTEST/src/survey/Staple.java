/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Staple#getFirst <em>First</em>}</li>
 *   <li>{@link survey.Staple#getMid <em>Mid</em>}</li>
 *   <li>{@link survey.Staple#getLast <em>Last</em>}</li>
 *   <li>{@link survey.Staple#getForks <em>Forks</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getStaple()
 * @model
 * @generated
 */
public interface Staple extends Question {
	/**
	 * Returns the value of the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' attribute.
	 * @see #setFirst(String)
	 * @see survey.SurveyPackage#getStaple_First()
	 * @model
	 * @generated
	 */
	String getFirst();

	/**
	 * Sets the value of the '{@link survey.Staple#getFirst <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' attribute.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(String value);

	/**
	 * Returns the value of the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mid</em>' attribute.
	 * @see #setMid(String)
	 * @see survey.SurveyPackage#getStaple_Mid()
	 * @model
	 * @generated
	 */
	String getMid();

	/**
	 * Sets the value of the '{@link survey.Staple#getMid <em>Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mid</em>' attribute.
	 * @see #getMid()
	 * @generated
	 */
	void setMid(String value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' attribute.
	 * @see #setLast(String)
	 * @see survey.SurveyPackage#getStaple_Last()
	 * @model
	 * @generated
	 */
	String getLast();

	/**
	 * Sets the value of the '{@link survey.Staple#getLast <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' attribute.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(String value);

	/**
	 * Returns the value of the '<em><b>Forks</b></em>' containment reference list.
	 * The list contents are of type {@link survey.RatingFork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' containment reference list.
	 * @see survey.SurveyPackage#getStaple_Forks()
	 * @model containment="true"
	 * @generated
	 */
	EList<RatingFork> getForks();

} // Staple
