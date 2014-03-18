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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import survey.Choice;
import survey.MultipleChoiceFork;
import survey.Question;
import survey.surveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.MultipleChoiceForkImpl#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link survey.impl.MultipleChoiceForkImpl#getForkedquestions <em>Forkedquestions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleChoiceForkImpl extends MinimalEObjectImpl.Container implements MultipleChoiceFork {
	/**
	 * The cached value of the '{@link #getMatcher() <em>Matcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatcher()
	 * @generated
	 * @ordered
	 */
	protected Choice matcher;

	/**
	 * The cached value of the '{@link #getForkedquestions() <em>Forkedquestions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedquestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> forkedquestions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return surveyPackage.Literals.MULTIPLE_CHOICE_FORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getMatcher() {
		if (matcher != null && matcher.eIsProxy()) {
			InternalEObject oldMatcher = (InternalEObject)matcher;
			matcher = (Choice)eResolveProxy(oldMatcher);
			if (matcher != oldMatcher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, surveyPackage.MULTIPLE_CHOICE_FORK__MATCHER, oldMatcher, matcher));
			}
		}
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice basicGetMatcher() {
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatcher(Choice newMatcher) {
		Choice oldMatcher = matcher;
		matcher = newMatcher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.MULTIPLE_CHOICE_FORK__MATCHER, oldMatcher, matcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getForkedquestions() {
		if (forkedquestions == null) {
			forkedquestions = new EObjectContainmentEList<Question>(Question.class, this, surveyPackage.MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS);
		}
		return forkedquestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case surveyPackage.MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS:
				return ((InternalEList<?>)getForkedquestions()).basicRemove(otherEnd, msgs);
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
			case surveyPackage.MULTIPLE_CHOICE_FORK__MATCHER:
				if (resolve) return getMatcher();
				return basicGetMatcher();
			case surveyPackage.MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS:
				return getForkedquestions();
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
			case surveyPackage.MULTIPLE_CHOICE_FORK__MATCHER:
				setMatcher((Choice)newValue);
				return;
			case surveyPackage.MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS:
				getForkedquestions().clear();
				getForkedquestions().addAll((Collection<? extends Question>)newValue);
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
			case surveyPackage.MULTIPLE_CHOICE_FORK__MATCHER:
				setMatcher((Choice)null);
				return;
			case surveyPackage.MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS:
				getForkedquestions().clear();
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
			case surveyPackage.MULTIPLE_CHOICE_FORK__MATCHER:
				return matcher != null;
			case surveyPackage.MULTIPLE_CHOICE_FORK__FORKEDQUESTIONS:
				return forkedquestions != null && !forkedquestions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultipleChoiceForkImpl
