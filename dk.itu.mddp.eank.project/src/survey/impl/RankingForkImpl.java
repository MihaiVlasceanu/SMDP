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
import survey.Question;
import survey.RankingFork;
import survey.surveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.RankingForkImpl#getForkedquestions <em>Forkedquestions</em>}</li>
 *   <li>{@link survey.impl.RankingForkImpl#getMin <em>Min</em>}</li>
 *   <li>{@link survey.impl.RankingForkImpl#getMax <em>Max</em>}</li>
 *   <li>{@link survey.impl.RankingForkImpl#getMatcher <em>Matcher</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RankingForkImpl extends MinimalEObjectImpl.Container implements RankingFork {
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
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RankingForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return surveyPackage.Literals.RANKING_FORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getForkedquestions() {
		if (forkedquestions == null) {
			forkedquestions = new EObjectContainmentEList<Question>(Question.class, this, surveyPackage.RANKING_FORK__FORKEDQUESTIONS);
		}
		return forkedquestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.RANKING_FORK__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.RANKING_FORK__MAX, oldMax, max));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, surveyPackage.RANKING_FORK__MATCHER, oldMatcher, matcher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, surveyPackage.RANKING_FORK__MATCHER, oldMatcher, matcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case surveyPackage.RANKING_FORK__FORKEDQUESTIONS:
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
			case surveyPackage.RANKING_FORK__FORKEDQUESTIONS:
				return getForkedquestions();
			case surveyPackage.RANKING_FORK__MIN:
				return getMin();
			case surveyPackage.RANKING_FORK__MAX:
				return getMax();
			case surveyPackage.RANKING_FORK__MATCHER:
				if (resolve) return getMatcher();
				return basicGetMatcher();
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
			case surveyPackage.RANKING_FORK__FORKEDQUESTIONS:
				getForkedquestions().clear();
				getForkedquestions().addAll((Collection<? extends Question>)newValue);
				return;
			case surveyPackage.RANKING_FORK__MIN:
				setMin((Integer)newValue);
				return;
			case surveyPackage.RANKING_FORK__MAX:
				setMax((Integer)newValue);
				return;
			case surveyPackage.RANKING_FORK__MATCHER:
				setMatcher((Choice)newValue);
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
			case surveyPackage.RANKING_FORK__FORKEDQUESTIONS:
				getForkedquestions().clear();
				return;
			case surveyPackage.RANKING_FORK__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case surveyPackage.RANKING_FORK__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case surveyPackage.RANKING_FORK__MATCHER:
				setMatcher((Choice)null);
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
			case surveyPackage.RANKING_FORK__FORKEDQUESTIONS:
				return forkedquestions != null && !forkedquestions.isEmpty();
			case surveyPackage.RANKING_FORK__MIN:
				return min != MIN_EDEFAULT;
			case surveyPackage.RANKING_FORK__MAX:
				return max != MAX_EDEFAULT;
			case surveyPackage.RANKING_FORK__MATCHER:
				return matcher != null;
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //RankingForkImpl
