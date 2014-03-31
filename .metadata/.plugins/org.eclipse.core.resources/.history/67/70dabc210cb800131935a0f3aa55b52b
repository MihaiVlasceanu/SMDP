/**
 */
package survey.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import survey.Choice;
import survey.ChoiceFork;
import survey.Question;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.ChoiceForkImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link survey.impl.ChoiceForkImpl#getOn <em>On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceForkImpl extends MinimalEObjectImpl.Container implements ChoiceFork {
	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> on;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.CHOICE_FORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectResolvingEList<Question>(Question.class, this, SurveyPackage.CHOICE_FORK__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getOn() {
		if (on == null) {
			on = new EObjectResolvingEList<Choice>(Choice.class, this, SurveyPackage.CHOICE_FORK__ON);
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.CHOICE_FORK__QUESTIONS:
				return getQuestions();
			case SurveyPackage.CHOICE_FORK__ON:
				return getOn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurveyPackage.CHOICE_FORK__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case SurveyPackage.CHOICE_FORK__ON:
				getOn().clear();
				getOn().addAll((Collection<? extends Choice>)newValue);
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
			case SurveyPackage.CHOICE_FORK__QUESTIONS:
				getQuestions().clear();
				return;
			case SurveyPackage.CHOICE_FORK__ON:
				getOn().clear();
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
			case SurveyPackage.CHOICE_FORK__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case SurveyPackage.CHOICE_FORK__ON:
				return on != null && !on.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChoiceForkImpl
