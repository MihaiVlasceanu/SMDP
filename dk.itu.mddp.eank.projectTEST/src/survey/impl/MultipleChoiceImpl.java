/**
 */
package survey.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import survey.Choice;
import survey.ChoiceFork;
import survey.MultipleChoice;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.MultipleChoiceImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link survey.impl.MultipleChoiceImpl#getOther <em>Other</em>}</li>
 *   <li>{@link survey.impl.MultipleChoiceImpl#getForks <em>Forks</em>}</li>
 *   <li>{@link survey.impl.MultipleChoiceImpl#getAnswerCount <em>Answer Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleChoiceImpl extends QuestionImpl implements MultipleChoice {
	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choice;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected String other = OTHER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForks() <em>Forks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks()
	 * @generated
	 * @ordered
	 */
	protected EList<ChoiceFork> forks;

	/**
	 * The default value of the '{@link #getAnswerCount() <em>Answer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ANSWER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnswerCount() <em>Answer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerCount()
	 * @generated
	 * @ordered
	 */
	protected int answerCount = ANSWER_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.MULTIPLE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoice() {
		if (choice == null) {
			choice = new EObjectContainmentEList<Choice>(Choice.class, this, SurveyPackage.MULTIPLE_CHOICE__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(String newOther) {
		String oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE_CHOICE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoiceFork> getForks() {
		if (forks == null) {
			forks = new EObjectContainmentEList<ChoiceFork>(ChoiceFork.class, this, SurveyPackage.MULTIPLE_CHOICE__FORKS);
		}
		return forks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnswerCount() {
		return answerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerCount(int newAnswerCount) {
		int oldAnswerCount = answerCount;
		answerCount = newAnswerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE_CHOICE__ANSWER_COUNT, oldAnswerCount, answerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyPackage.MULTIPLE_CHOICE__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case SurveyPackage.MULTIPLE_CHOICE__FORKS:
				return ((InternalEList<?>)getForks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.MULTIPLE_CHOICE__CHOICE:
				return getChoice();
			case SurveyPackage.MULTIPLE_CHOICE__OTHER:
				return getOther();
			case SurveyPackage.MULTIPLE_CHOICE__FORKS:
				return getForks();
			case SurveyPackage.MULTIPLE_CHOICE__ANSWER_COUNT:
				return getAnswerCount();
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
			case SurveyPackage.MULTIPLE_CHOICE__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends Choice>)newValue);
				return;
			case SurveyPackage.MULTIPLE_CHOICE__OTHER:
				setOther((String)newValue);
				return;
			case SurveyPackage.MULTIPLE_CHOICE__FORKS:
				getForks().clear();
				getForks().addAll((Collection<? extends ChoiceFork>)newValue);
				return;
			case SurveyPackage.MULTIPLE_CHOICE__ANSWER_COUNT:
				setAnswerCount((Integer)newValue);
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
			case SurveyPackage.MULTIPLE_CHOICE__CHOICE:
				getChoice().clear();
				return;
			case SurveyPackage.MULTIPLE_CHOICE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case SurveyPackage.MULTIPLE_CHOICE__FORKS:
				getForks().clear();
				return;
			case SurveyPackage.MULTIPLE_CHOICE__ANSWER_COUNT:
				setAnswerCount(ANSWER_COUNT_EDEFAULT);
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
			case SurveyPackage.MULTIPLE_CHOICE__CHOICE:
				return choice != null && !choice.isEmpty();
			case SurveyPackage.MULTIPLE_CHOICE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case SurveyPackage.MULTIPLE_CHOICE__FORKS:
				return forks != null && !forks.isEmpty();
			case SurveyPackage.MULTIPLE_CHOICE__ANSWER_COUNT:
				return answerCount != ANSWER_COUNT_EDEFAULT;
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
		result.append(" (other: ");
		result.append(other);
		result.append(", answerCount: ");
		result.append(answerCount);
		result.append(')');
		return result.toString();
	}

} //MultipleChoiceImpl
