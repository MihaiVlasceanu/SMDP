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
import survey.MultipleChoice;
import survey.MultipleChoiceFork;
import survey.surveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.MultipleChoiceImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link survey.impl.MultipleChoiceImpl#getMultipleChoiceForks <em>Multiple Choice Forks</em>}</li>
 *   <li>{@link survey.impl.MultipleChoiceImpl#getOther <em>Other</em>}</li>
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
	 * The cached value of the '{@link #getMultipleChoiceForks() <em>Multiple Choice Forks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceForks()
	 * @generated
	 * @ordered
	 */
	protected EList<MultipleChoiceFork> multipleChoiceForks;

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
		return surveyPackage.Literals.MULTIPLE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoice() {
		if (choice == null) {
			choice = new EObjectContainmentEList<Choice>(Choice.class, this, surveyPackage.MULTIPLE_CHOICE__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultipleChoiceFork> getMultipleChoiceForks() {
		if (multipleChoiceForks == null) {
			multipleChoiceForks = new EObjectContainmentEList<MultipleChoiceFork>(MultipleChoiceFork.class, this, surveyPackage.MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS);
		}
		return multipleChoiceForks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.MULTIPLE_CHOICE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case surveyPackage.MULTIPLE_CHOICE__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case surveyPackage.MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS:
				return ((InternalEList<?>)getMultipleChoiceForks()).basicRemove(otherEnd, msgs);
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
			case surveyPackage.MULTIPLE_CHOICE__CHOICE:
				return getChoice();
			case surveyPackage.MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS:
				return getMultipleChoiceForks();
			case surveyPackage.MULTIPLE_CHOICE__OTHER:
				return getOther();
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
			case surveyPackage.MULTIPLE_CHOICE__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends Choice>)newValue);
				return;
			case surveyPackage.MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS:
				getMultipleChoiceForks().clear();
				getMultipleChoiceForks().addAll((Collection<? extends MultipleChoiceFork>)newValue);
				return;
			case surveyPackage.MULTIPLE_CHOICE__OTHER:
				setOther((String)newValue);
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
			case surveyPackage.MULTIPLE_CHOICE__CHOICE:
				getChoice().clear();
				return;
			case surveyPackage.MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS:
				getMultipleChoiceForks().clear();
				return;
			case surveyPackage.MULTIPLE_CHOICE__OTHER:
				setOther(OTHER_EDEFAULT);
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
			case surveyPackage.MULTIPLE_CHOICE__CHOICE:
				return choice != null && !choice.isEmpty();
			case surveyPackage.MULTIPLE_CHOICE__MULTIPLE_CHOICE_FORKS:
				return multipleChoiceForks != null && !multipleChoiceForks.isEmpty();
			case surveyPackage.MULTIPLE_CHOICE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
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
		result.append(')');
		return result.toString();
	}

} //MultipleChoiceImpl
