/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Rating#getMin <em>Min</em>}</li>
 *   <li>{@link survey.Rating#getMax <em>Max</em>}</li>
 *   <li>{@link survey.Rating#getFirst <em>First</em>}</li>
 *   <li>{@link survey.Rating#getLast <em>Last</em>}</li>
 *   <li>{@link survey.Rating#getRatingForks <em>Rating Forks</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends Question {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see survey.surveyPackage#getRating_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link survey.Rating#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see survey.surveyPackage#getRating_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link survey.Rating#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

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
	 * @see survey.surveyPackage#getRating_First()
	 * @model
	 * @generated
	 */
	String getFirst();

	/**
	 * Sets the value of the '{@link survey.Rating#getFirst <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' attribute.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(String value);

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
	 * @see survey.surveyPackage#getRating_Last()
	 * @model
	 * @generated
	 */
	String getLast();

	/**
	 * Sets the value of the '{@link survey.Rating#getLast <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' attribute.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(String value);

	/**
	 * Returns the value of the '<em><b>Rating Forks</b></em>' containment reference list.
	 * The list contents are of type {@link survey.RatingFork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Forks</em>' containment reference list.
	 * @see survey.surveyPackage#getRating_RatingForks()
	 * @model containment="true"
	 * @generated
	 */
	EList<RatingFork> getRatingForks();

} // Rating
