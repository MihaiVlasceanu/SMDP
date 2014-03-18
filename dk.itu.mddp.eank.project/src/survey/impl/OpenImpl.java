/**
 */
package survey.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import survey.Open;
import survey.surveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.OpenImpl#getAnswerLength <em>Answer Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenImpl extends QuestionImpl implements Open {
	/**
	 * The default value of the '{@link #getAnswerLength() <em>Answer Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerLength()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSWER_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswerLength() <em>Answer Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerLength()
	 * @generated
	 * @ordered
	 */
	protected String answerLength = ANSWER_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return surveyPackage.Literals.OPEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnswerLength() {
		return answerLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerLength(String newAnswerLength) {
		String oldAnswerLength = answerLength;
		answerLength = newAnswerLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.OPEN__ANSWER_LENGTH, oldAnswerLength, answerLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case surveyPackage.OPEN__ANSWER_LENGTH:
				return getAnswerLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case surveyPackage.OPEN__ANSWER_LENGTH:
				setAnswerLength((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case surveyPackage.OPEN__ANSWER_LENGTH:
				setAnswerLength(ANSWER_LENGTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case surveyPackage.OPEN__ANSWER_LENGTH:
				return ANSWER_LENGTH_EDEFAULT == null ? answerLength != null : !ANSWER_LENGTH_EDEFAULT.equals(answerLength);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AnswerLength: ");
		result.append(answerLength);
		result.append(')');
		return result.toString();
	}

} //OpenImpl
